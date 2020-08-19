package com.enigma;

public class Okyes {
    public static void PrintOKYes(){
        int n = 15;
        for (int i = 1; i <=n ; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print("OKYES  ");
            } else if(i % 3 == 0){
                System.out.print("OK  ");
            } else if (i % 4 == 0){
                System.out.print("YES  ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
}
