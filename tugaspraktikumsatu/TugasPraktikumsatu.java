package tugaspraktikumsatu;

import java.util.Scanner;

public class TugasPraktikumsatu {
    public static void main(String[] args) {
        String a, b;
        System.out.println("Input nama lengkap: ");
        Scanner A = new Scanner(System.in);
        a = A.nextLine();
        System.out.println("Input NIM: ");
        Scanner B = new Scanner(System.in);
        b = B.nextLine();
        
        System.out.println("Halo, saya "+ a + " dengan NIM "+ b +" dari Program Studi Ilmu Komputer. Salam Kenal. ");
    }   
}


