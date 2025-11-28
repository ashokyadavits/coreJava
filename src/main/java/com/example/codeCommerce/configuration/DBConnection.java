package com.example.codeCommerce.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();

        // Correct MySQL URL
        config.setJdbcUrl("jdbc:mysql://localhost:3306/codecommerce?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
        config.setUsername("root");
        config.setPassword("root");

        // Driver
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // HikariCP Settings
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(30000);
        config.setConnectionTimeout(30000);
        config.setPoolName("EcommerceHikariCP");

        return new HikariDataSource(config);
    }
}