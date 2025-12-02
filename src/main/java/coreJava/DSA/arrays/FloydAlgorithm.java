package coreJava.DSA.arrays;

class FloydAlgrothim {

    public static void main(String[] args) {
        int number = 1;

        // pattern printing
        for (int i = 1; i <= 5; i++) {     // rows
            for (int j = 1; j <= i; j++) { // columns
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}