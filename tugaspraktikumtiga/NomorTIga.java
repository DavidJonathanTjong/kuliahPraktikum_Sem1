package tugaspraktikumtiga;

import java.util.Scanner;
public class NomorTIga {
    public static void main(String[]args){
        // beli 2 gratis 1
        int a, b;
        System.out.print("Input jumlah barang: ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        
        if(a%2 == 1){
            b = a/2;
            System.out.println("Anda membeli " +a+" item dengan bonus sebanyak "+b+" item, total item yang anda dapatkan sebanyak "+(a+b)+" item");
        }  
        else if(a == 0){
            
        }
        else if (a%5 ==0 ){
            b = a/2;
            System.out.println("Anda membeli " +a+" item dengan bonus sebanyak "+b+" item, total item yang anda dapatkan sebanyak "+(a+b)+" item");
            System.out.println("Anda mendapatkan tambahan cashback Rp15.000");
        }
        
    }
}
