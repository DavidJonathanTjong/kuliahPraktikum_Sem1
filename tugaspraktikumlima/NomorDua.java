package tugaspraktikumlima;

import java.util.Scanner;

public class NomorDua {
    public static void main(String[]args){
        int a;
        System.out.print("Ukuran: ");
        Scanner A = new Scanner (System.in);
        a = A.nextInt();
        
        for(int i=1; i<=a; i++){
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int n = a; n>=i; n--){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(int i=1; i<=a; i++){
            for(int x = 1; x<=(a-i); x++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");               
            }
            System.out.println("");
        }

        }
    }