package tugaspraktikumtujuh;

import java.util.Scanner;

public class Nomordua {

    public static void bilprima(int bil) {
        for (int i = 0; i <= 99999; i++) {
            int angka;
            boolean prima = true;
            if (bil == 0 || bil == 1 || bil < 0) {
                prima = false;
                System.out.println(bil + " bukan bilangan prima");
                break;
            } else {
                for (int j = 2; j <= bil / 2; j++) {
                    if (bil % j == 0) {
                        prima = false;
                        break;
                    }
                }
                if (prima) {
                    System.out.println(bil + " adalah bilangan prima");
                    break;
                } else {
                    System.out.println(bil + " bukan bilangan prima");
                    break;
                }
            }
        }
    }

    public static void fibbonaci(int bil) {
        
            int x = 0;
            int y = 1;
            for (int j = 1; j <= bil+3; j++) {
            int z = x + y;
            x = y;
            y = z;         
             if (x==bil || y==bil || z == bil) {
                System.out.println(bil + " adalah bilangan fibbonaci");
                break;
            } 
             if(j==bil){
                 System.out.println(bil+ " bukan bilangan fibbonaci");
                 break;
             }         
        }      
    }

    public static void main(String[] args) {
        int bil;
        System.out.print("Masukan bilangan: ");
        Scanner input = new Scanner(System.in);
        bil = input.nextInt();
        bilprima(bil);
        fibbonaci(bil);
    }
}
