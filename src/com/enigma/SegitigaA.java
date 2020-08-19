package com.enigma;

public class SegitigaA {
    public static void SegitigaKiri(){
        System.out.println("A");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j)
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
