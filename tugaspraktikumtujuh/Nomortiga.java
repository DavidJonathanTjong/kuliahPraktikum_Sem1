package tugaspraktikumtujuh;

import java.util.Scanner;

public class Nomortiga {
     static void kelipatan() {
        Scanner input = new Scanner(System.in);
        int rentang1, rentang2, nilaikelipatan;
        int x = 0;
        System.out.print("Masukan kelipatan angka: ");
        nilaikelipatan = input.nextInt();
        System.out.print("Masukan rentang angka pertama:");
        rentang1 = input.nextInt();
        System.out.print("Masukan rentang angka kedua: ");
        rentang2 = input.nextInt();

        for (int i = rentang1; i <= rentang2; i++) {
            if (i % nilaikelipatan == 0) {
                x += nilaikelipatan;
                if (x >= rentang1 && x <= rentang2) {
                    System.out.print(x + " ");
                   
                }
            }
        }
         System.out.println();
    }

    public static void main(String[] args) {
        kelipatan();
        int a;
        Scanner masukan = new Scanner(System.in);
        while(true){
        System.out.print("Apakah ingin mngulang inputan?\n1. YA \t2. Tidak (1/2): ");
        a = masukan.nextInt();
        if(a==1){
            kelipatan();
        }
        else if(a==2){
            break;
        }
        else{
            
        }
        }
    }
}
