package coreJava.collection;

public class ArrayCode {

    public static void main(String[] args) {

        int[] a = new int[12]; // declaration
        a[0] = 12;
        a[1] = 20;

        String[] fru = {"abc", "bbcb"};

        // multidimancional array

        int[][] ab = new int[2][2];

        ///

        int[] abcd = {1, 2, 3, 4};
        int[] abcd1 = {8, 9, 10};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(abcd[1]);
        System.out.println(arr[1][1]);
        System.out.println("length = " + abcd.length);

        int[] newArray = new int[abcd.length + abcd1.length];

        int[] array = new int[9];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[1]);

        String str = "apple";
        String str1 = new String("apple");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));

        // find

        int[] intarray = new int[5];
        intarray[0] = 10;
        intarray[2] = 20;
        for (int i = 0; i < intarray.length; i++) {

            if (i == 10) {
                System.out.println(intarray[i]);
            }
        }


        int arra[] = {1, 2, 3, 4, 4, 5};
        for (int i = 0; i < arra.length; i++) {
            if (i == 5) {
                System.out.println(arra[i]);
            }
        }

        int num[] = {1, 0, 2, 3, 0, 4};
        int num1[] = new int[5];

        for (int i = 0; i < num.length; i++) {
            if (i > 0) {
                i++;
            }
            System.out.print(i);
        }
    }
}