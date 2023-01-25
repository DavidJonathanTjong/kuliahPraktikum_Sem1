package tugaspraktikumdelapan;

import java.util.Scanner;

public class NomorEmpat {

    public static int output(int n) {
        if(n==0 || n ==1)
            return n;
        else{
            return (output(n-1)+output(n-2));
        }
                    
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input n: ");
        int n = input.nextInt();
        System.out.println("Bilangan Fibbonaci ke-" + n + " adalah " + output(n));
    }
}

