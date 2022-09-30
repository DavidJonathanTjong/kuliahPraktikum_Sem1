package tugaspraktikumtiga;

import java.util.Scanner;

public class NomorSatu {
    public static void main (String[]args){
        int nilai;
        System.out.print("Masukan nilai: ");
        Scanner A = new Scanner(System.in);
        nilai = A.nextInt();
        if(nilai == 0){
            System.out.println("Salah");
        }
        else if(nilai%10 == 0){
            System.out.println("Benar");
        }
        else{
            System.out.println("Salah");
        }
    }   
}
