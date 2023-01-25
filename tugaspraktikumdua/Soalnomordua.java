package tugaspraktikumdua;
import java.util.Scanner;
public class Soalnomordua {
    public static void main(String[] args){
        double a, b;
        System.out.println("Masukan A: ");
        Scanner A = new Scanner (System.in);
        a = A.nextDouble();
        System.out.println("Masukan B: ");
        Scanner B = new Scanner (System.in);
        b = B.nextDouble();
        String pernyataan = a > b ? "YA" : "TIDAK";
        System.out.println("Apakah a > b ? "+ pernyataan);
    }
    }
        
    
        
        
        
        
        

