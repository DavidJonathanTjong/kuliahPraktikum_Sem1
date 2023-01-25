package tugaspraktikumenam;
import java.util.Scanner;
public class nomorTiga {
    public static void main(String[] args) {
        int masukan1;
        int masukan2; 
        Scanner input = new Scanner(System.in);
            System.out.print("Masukan nilai pertama: ");
            masukan1 = input.nextInt();
            System.out.print("Masukan nilai kedua: ");
            masukan2 = input.nextInt();         
            System.out.println("x \t | \t 1 \t 2\n------------------------");
        while(masukan1<=masukan2){  
                System.out.println(masukan1 + "\t | \t" + (masukan1*1) + "\t " + (masukan1*2));             
            masukan1++;
        }     
    }  
}
    

