package tugaspraktikumtiga;

import java.util.Scanner;

public class NomorDua {
    public static void main(String[]args){
        double ip ;
        int sks = 0;
        System.out.print("Masukan IP: ");
        Scanner A = new Scanner(System.in);
        ip = A.nextDouble();
        if(ip < 4 && 3.5<=ip){
            sks = 24;  
            System.out.println("Jatah SKS: "+ sks);
        }
        else if(ip<3.5 && 3<=ip){
            sks = 23;
            System.out.println("Jatah SKS: "+ sks);
        }
        else if(ip<3 && 2.75<=ip){
            sks = 22;
            System.out.println("Jatah SKS: "+ sks);
        }
        else if(ip<2.75 && 2.5<=ip){
        sks = 20;
        System.out.println("Jatah SKS: "+ sks);
    }
        else if(ip<2.5 && ip>=0){
        sks = 18;
        System.out.println("Jatah SKS: "+ sks);
    }
        else if(ip<0){
            System.out.print("Sistem error ");  
        }
        else{
        System.out.print("Sistem error ");       
        }
       
    }           
}
