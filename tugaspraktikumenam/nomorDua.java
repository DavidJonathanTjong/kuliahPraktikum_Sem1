package tugaspraktikumenam;
import java.util.Scanner;
public class nomorDua {
    public static void main(String[] args) {
        int maks=0, min=0, hasil=0;
        String keputusan = "y";
        int jum_angka;
        int masukan, i=1;
        double rerata =0;
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        System.out.print("Masukan jumlah angka: ");
        jum_angka = input.nextInt();
        do{
                System.out.print("Masukan angka ke-"+i+": ");
                masukan=input.nextInt();
                hasil += masukan;              
            if(i==1){
                maks= masukan;
                min = masukan;
            }
            maks = maks<masukan ? masukan : maks;
            min = min>masukan ? masukan : min;
            System.out.print("Apakah ingin dilanjutkan (Y/N): ");
            keputusan = input2.nextLine(); 
            i++;
        }while(keputusan.equalsIgnoreCase("y"));   
        
            rerata = (double) hasil/jum_angka;
            System.out.println("Rerata angka adalah: "+rerata);
            System.out.println("Nilai terkecil adalah: "+min);
            System.out.println("Nilai terbesar adalah: "+maks);

    }       
}
