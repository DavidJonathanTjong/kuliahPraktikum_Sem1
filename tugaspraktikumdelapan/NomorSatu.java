package tugaspraktikumdelapan;
import java.util.Scanner;
public class NomorSatu {
    static Scanner input = new Scanner (System.in);
    public static int umur(int tahunKel){
        int umur = 2022 - tahunKel;
        return umur;
    }
    
    public static void main(String[] args) {   
        System.out.print("Masukan nama: ");       
        String nama= input.nextLine();
        System.out.print("Masukan tahun lahir: ");
        int tahunKel = input.nextInt();     
        System.out.println("Umur "+nama+" adalah "+umur(tahunKel)+" Tahun." );
    }  
}
