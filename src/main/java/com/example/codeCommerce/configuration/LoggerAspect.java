package com.example.codeCommerce.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 🔹 Pointcut to intercept all methods in controller, service, or repository
    @Pointcut("execution(* com.ecommerce.controller..*(..)) || " +
            "execution(* com.ecommerce.service..*(..)) || " +
            "execution(* com.ecommerce.repository..*(..))")
    public void applicationPackagePointcut() {
        // Pointcut definition
    }

    // 🔹 Log method start
    @Before("applicationPackagePointcut()")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("➡ Entering Method: {}", methodName);
    }

    // 🔹 Log method exit
    @AfterReturning(pointcut = "applicationPackagePointcut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("✅ Exiting Method: {} | Return: {}", methodName, result);
    }

    // 🔹 Log exceptions globally
    @AfterThrowing(pointcut = "applicationPackagePointcut()", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.error("❌ Exception in Method: {} | Message: {}", methodName, error.getMessage(), error);
    }

    // 🔹 Measure execution time
    @Around("applicationPackagePointcut()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // execute method

        long duration = System.currentTimeMillis() - start;
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("⏱ Execution Time: {}.{}() took {} ms",
                signature.getDeclaringTypeName(),
                signature.getName(),
                duration);

        return result;
    }
}