package tugaspraktikumtujuh;

import java.util.Scanner;

public class Nomorempat {

    static void lingkaran(double radius, double sisi) {
        if (radius == 0 && sisi == 0) {
            System.out.println("Masukan radius dan panjang sisi terlebih dulu");
        } else {
            double luasLingkaran = 3.14 * radius * radius;
            double kelilingLingkaran = 3.14 * radius * 2;
            System.out.println("Luas Lingkaran: " + luasLingkaran);
            System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
        }
    }

    static void segitiga(double radius, double sisi) {
        if (radius == 0 && sisi == 0) {
            System.out.println("Masukan radius dan panjang sisi terlebih dulu");
        } else {
            double tinggi = radius*2;
            double sisimiring = Math.sqrt(((sisi/2 ) * (sisi/2 )) + (tinggi*tinggi));
            System.out.println("Luas Segitiga : " + (double) (sisi * radius));
            System.out.println("Keliling Segitiga : " + (double) (2*sisimiring) + sisi);
        }
    }

    static void panjangL(double radius, double sisi) {
        if (radius == 0 && sisi == 0) {
            //diameter = tinggi
            System.out.println("Masukan radius dan panjang sisi terlebih dulu");
        } else {
            double tinggi = radius*2;
            double sisimiring = Math.sqrt(((sisi/2 ) * (sisi/2 )) + (tinggi*tinggi));
            System.out.println("Luas L : " + (double) ((2*radius) + sisi + (2 * radius)));          
        }
    }

    public static void main(String[] args) {
        int menu;
        double radius = 0, sisi = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("DAFTAR MENU \n1. Input nilai radius dan panjang sisi"
                    + "\n2. Hitung Luas dan Keliling Lingkaran\n3. Hitung Luas dan Keliling"
                    + "segitiga sama kaki\n4. Hitung panjang L\n5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukan nilai radius: ");
                    radius = input.nextDouble();
                    System.out.print("Masukan panjang sisi: ");
                    sisi = input.nextDouble();
                    break;
                case 2:
                    lingkaran(radius, sisi);
                    break;
                case 3:
                    segitiga(radius, sisi);
                    break;
                case 4:
                    panjangL(radius, sisi);
                    break;
                default:
            }
            if (menu == 5) {
                break;
            }
        }
    }
}
