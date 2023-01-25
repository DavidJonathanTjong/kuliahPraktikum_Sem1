package tugaspraktikumempat;

import java.util.Scanner;

public class NomorTiga {
    public static void main (String[]args){
        String a;
        System.out.print("Input warna: ");
        Scanner A = new Scanner(System.in);
        a = A.nextLine();
        switch(a){
            case "merah":
            case "biru":
            case "kuning":
            System.out.println(a+" adalah warna primer");
            break;
            default:
                System.out.println(a+" bukan warna primer");
        }      
    }
}
