package tugaspraktikumdelapan;

import java.util.Scanner;

public class NomorTiga {
    
    public static double output (int a, int r, int n){
        if(r>1){
            double hasil = (a*(Math.pow(r, n)-1));
            double x = r-1;
            return hasil/x;       
    
        }
        else if(r<1){
            double hasil = (1-a*(Math.pow(r, n)) );
            double y = 1-r;
            return hasil/y;  
        }
        return 0;
    }     
        
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("input a: ");
        int a = input.nextInt();
        System.out.print("input r: ");
        int r = input.nextInt();
        System.out.print("input n: ");
        int n = input.nextInt();
        System.out.println("Jumlah "+n+" suku pertama barisan geometri tersebut adalah "+output(a, r, n));
    }
}
