package tugaspraktikumdua;
import java.util.Scanner;

public class TugasPraktikumdua {

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Masukan panjang: ");
        
        Scanner A = new Scanner (System.in);
        a = A.nextInt();
        System.out.println("Masukan lebar: " );
        Scanner B = new Scanner (System.in);
        b = B.nextInt();
        System.out.println("Masukan tinggi: ");
        Scanner C = new Scanner (System.in);
        c = C.nextInt();
        System.out.println("Volume balok: " + (a*b*c));
        
    }
    
}
