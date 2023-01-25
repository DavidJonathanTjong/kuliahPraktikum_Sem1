package tugaspraktikumempat;

import java.util.Scanner;

public class NomorEmpat {
    public static void main(String[]args){
        String a, hari;
        System.out.print("Input bulan: ");
        Scanner A = new Scanner (System.in);
        a = A.nextLine();
        switch(a){
            case "januari":
            case "maret":
            case "mei":
            case "juli":
            case "agustus":
            case "oktober":               
            case "desember":
                hari = "31";
                System.out.println("Jumlah hari pada bulan "+a+" adalah "+hari+" hari");
                break;
            case "april":
            case "juni":
            case "september":    
            case "november":    
                hari = "30";
                System.out.println("Jumlah hari pada bulan "+a+" adalah "+hari+" hari");
                break;
            case "februari":
                hari = "28";
                System.out.println("Jumlah hari pada bulan "+a+" adalah "+hari+" hari");
                break;
            default:
                System.out.println("Inputan tidak sesuai");
        }
    }
}
