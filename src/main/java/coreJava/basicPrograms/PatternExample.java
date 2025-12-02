package coreJava.basicPrograms;

public class PatternExample {

    public static void main(String[] args) {

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }*/
///

         for(int i = 1; i<=5; i++){
             for(int j = 1; j<=5-i+1; j++){
                 System.out.print("*");
             }
             System.out.println();
         }


 // reverse

      /*  int num = 12345;

         String str = String.valueOf(num);
         for(int i = str.length() -1; i<=num; i--){
             System.out.println(i);
         }
         */

         for(int i = 0; i <=5; i++){
             for(int j = 0; j <=i-1+1; j++){
                 System.out.print("*");
             }
             System.out.println("");
         }

    }

    }