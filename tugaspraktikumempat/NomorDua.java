package tugaspraktikumempat;

import java.util.Scanner;

public class NomorDua {
    public static void main (String[]args){
        String a;
        Scanner A = new Scanner (System.in);
        System.out.println("Apakah programmer pasti copas coding ?");
        System.out.println("A. Iya\t B. Tergantung orangnya\t C. Tidak \t D. Tanya Jokowi\t E. Gak tau");
        System.out.print("input pilihan: ");
        a = A.nextLine();      
        switch(a){
            case "b":
            System.out.println("Jawaban benar");
            break;
            case "B":
            System.out.println("Jawaban benar");       
            break;
            default:
                System.out.println("Jawaban salah");                              
        }      
    }    
}
