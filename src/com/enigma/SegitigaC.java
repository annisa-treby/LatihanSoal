package com.enigma;

public class SegitigaC {
    public static void SegitigaKiriNaikTurun(){
        int num = 1;
        int m = 5;
        boolean max = true;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(num);
                if (max){
                    num++;
                } else {
                    num--;
                }
                if (num == 1){
                    max = true;
                } else if (num==5){
                    max = false;
                }
            }
            System.out.println();
        }
    }
}
