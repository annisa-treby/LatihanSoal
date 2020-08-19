package com.enigma;

public class SegitigaB {
    public static void SegitigaRataKiriB(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j >=1 ; j--) {
                if (j <= i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
