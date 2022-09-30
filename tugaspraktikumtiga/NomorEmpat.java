package tugaspraktikumtiga;

import java.util.Scanner;

public class NomorEmpat {
    
    public static void main(String[] args) {
        String menu;
        int a, diskon=0, totalHarga, totalBelanja;
        System.out.println("Menu 1 = beli minuman\t Menu 2 = keluar");
        System.out.print("Pilih menu: ");
        Scanner Drink = new Scanner (System.in);
        menu = Drink.nextLine();
        if(menu.equalsIgnoreCase("Menu 1")){
                System.out.print("Jumlah minuman yang dibeli: ");
                Scanner A = new Scanner (System.in);
                a = A.nextInt();
                totalBelanja = a*10000;
                if(totalBelanja>50000){
                    diskon = totalBelanja/10;
                }
                else if(totalBelanja>30000){
                    diskon = totalBelanja/20;
            }
                else{
                    diskon=0;
                }        
        totalHarga = totalBelanja - diskon;
        System.out.print("Anda membeli minuman sebanyak "+a+" buah dengan total harga Rp."+totalBelanja+" dan potongan Rp."+diskon+", total belanja keseluruhan Rp."+totalHarga);  
        
    } 
        else if(menu.equalsIgnoreCase("Menu 2")){
            System.out.print("Anda keluar dari program ");            
        }
        else {
            System.out.print("Menu tidak tersedia ");  
        }
        
    }
} 

