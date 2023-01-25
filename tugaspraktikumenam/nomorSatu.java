package tugaspraktikumenam;
import java.util.Scanner;
public class nomorSatu {
    public static void main(String[] args) {   
        int masukanNomor;
        do{
            System.out.println("Menu 1. Lanjut /t Menu 2. Berhenti");
            System.out.print("Pilih menu: ");
            Scanner input = new Scanner (System.in);
            masukanNomor = input.nextInt();
            if(masukanNomor ==1)
                System.out.println("Lanjut!");
        }while(masukanNomor!=2);
    }
    
}
