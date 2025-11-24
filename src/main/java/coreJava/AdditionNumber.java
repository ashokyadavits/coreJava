package coreJava;

 class AdditionToKey {
    public static void main(String[] args) {

        int[] num  = {3, 9, 10, 5, 6, 7, 8};
        int key = 11;
        for(int i = 0; i < num.length-1; i++){
            for(int j = i+1 ;  j < num.length; j++){
                if(num[i] + num[j] == key){
                    System.out.println(num[i] + " "+ num[j]);

                }
            }
        }

    }
}