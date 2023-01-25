package tugaspraktikumlima;
import java.util.Scanner;
public class NomorSatu {
    public static void main(String[] args) {
        int a;
        float rt = 0;      
        System.out.print("Masukan jumlah angka: ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        int max = a;
        int i;
        for(i=1; i<=a; i++){
            System.out.println("Masukan angka ke-"+i+": "+i);
        }
        for(i=1; i<=a; i++){
            if(i == 1){
                System.out.println("Nilai terkecil: "+ i);
            }
            if(i == a){
                System.out.println("Nilai terbesar: "+a);
            }           
        }
        for(i=1; i<=a; i++){
            rt += i;         
        }   
        float hasil = rt/a;
        System.out.println("Rata-rata: "+ hasil);
    } 
}
