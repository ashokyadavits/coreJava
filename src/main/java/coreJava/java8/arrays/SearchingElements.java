package coreJava.java8.arrays;

public class SearchingElements {
    public static void main(String[] args) {

        int [] ar = {1,6, 7, 2,3,4,5};
        int key = 11;
        for(int i =0; i < ar.length; i++){
            for (int j = i+1; j < ar.length; j++){
                if(ar[i] + ar[j] == key){
                    System.out.println(ar[i] +" "+ ar[j]);
                }
            }
        }

    }
}