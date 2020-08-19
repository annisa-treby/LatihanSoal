package com.enigma;

public class SegitigaD {
    public static void PrintSnakeBox(){
        int n = 5;
        int distance = n*2;

        for (int i = 1; i <=n ; i++) {
            int temp = i;
            int difference = i-1;
            for (int j = 1; j <=n ; j++) {
                System.out.print(temp+" ");
                if (j%2==0){
                    temp += i+difference;
                } else {
                    temp += (distance-i);
                }
            }
            distance--;
            System.out.println();

        }
    }
}
