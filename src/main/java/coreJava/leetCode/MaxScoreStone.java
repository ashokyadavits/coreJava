package coreJava.leetCode;

public class MaxScoreStone {
    public static void main(String[] args) {

        int a =2, b=4, c= 6;

        int mxPile = Math.max(a, Math.max(b,c));
        int minPile = Math.min(a,Math.min(b,c));
        int score = minPile;

        int secondMax = a+b+c -minPile- mxPile;
        mxPile = mxPile -minPile;
        score = score + Math.min(mxPile,secondMax);
        System.out.println(score);

    }
}