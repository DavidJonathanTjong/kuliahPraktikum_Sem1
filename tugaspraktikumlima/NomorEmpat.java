package tugaspraktikumlima;
import java.util.Scanner;
public class NomorEmpat {
    public static void main(String[]args){
        int a;
        int x =0;
        int y =1;

        System.out.print("Masukan bilangan: ");
        Scanner A = new Scanner (System.in);
        a = A.nextInt();
        
       for (int i = 1; i <= a; i++){
           System.out.print(x+" ");
           int z = x+y;
           x=y;
           y=z;       
       }
    }
}
