package tugaspraktikumempat;

import java.util.Scanner;

public class NomorSatu {
    public static void main(String[] args) {
        int p, l, t;
        int k, luas, v;
        System.out.println("Menghitung keliling, luas, dan volume balok ");
        Scanner A = new Scanner(System.in);
        System.out.print("Masukan panjang: ");
        p = A.nextInt();
        System.out.print("Masukan lebar: ");
        l = A.nextInt();
        System.out.print("Masukan tinggi: ");
        t = A.nextInt();
        
        int a = 1;
        switch (a){
            case 1:
            k = 4*(p+l+t);
            System.out.println("Keliling balok adalah: "+k);
            case 2:
            luas = 2*(p*l+p*t+l*t);
            System.out.println("Luas balok adalah: "+luas);
            case 3:
            v = p*l*t;
            System.out.println("Volume balok adalah: "+v);
            break;          
        }       
    }    
}
