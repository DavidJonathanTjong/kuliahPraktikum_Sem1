package tugaspraktikumdelapan;

import java.util.Scanner;

public class NomorDua {

    static Scanner input = new Scanner(System.in);

    public static String ulang() {
        return "Masukan radius dan tinggi terlebih dulu";
    }

    public static double hitLuaslingkaran(double r) {
        double luasLingkaran = 3.14 * r * r;
        return luasLingkaran;
    }

    public static double hitLuasSelimutTabung(double r, double t) {
        double hasil = 2 * 3.14 * r * t;
        return hasil;
    }

    public static double hitLuasPermukaanTabung(double r, double t) {
        double a = hitLuaslingkaran(r);
        double b = hitLuasSelimutTabung(r, t);
        double hasil = 2 * a + b;
        return hasil;
    }

    public static void main(String[] args) {
        int menu;
        double r = 0, t = 0;
        boolean cek1 = false;
        boolean cek2 = false;
        while (true) {
            System.out.println("DAFTAR MENU \n1. Input jari-jari\n2. Input Tinggi\n3. Hitung Luas Lingkaran"
                    + "\n4. Hitung Luas Selimut tabung (persegi) \n5. Hitung Luas Permukaan Tabung\n6. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5/6): ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Input radius: ");
                    r = input.nextDouble();
                    cek1 = true;
                    break;
                case 2:
                    System.out.print("Input tinggi: ");
                    t = input.nextDouble();
                    cek2 = true;
                    break;
                case 3:
                    if (cek1 == true) {
                        if(cek2 == true){
                            double nilai3 = hitLuaslingkaran(r);
                        System.out.println(nilai3);
                        }                       
                        else if (cek2 == false) {
                        String hasil = ulang();
                        System.out.println(hasil);
                        }
                    } else {
                        String hasil = ulang();
                        System.out.println(hasil);
                    }
                    break;
                case 4:
                    if (cek1 == true) {
                        if (cek2 == true) {
                            double nilai4 = hitLuasSelimutTabung(r, t);
                            System.out.println(nilai4);
                        } else if (cek2 == false) {
                            String hasil = ulang();
                            System.out.println(hasil);
                        }
                    } else {
                        String hasil = ulang();
                        System.out.println(hasil);
                    }
                    break;
                case 5:
                    if (cek1 == true) {
                        if (cek2 == true) {
                            double nilai5 = hitLuasPermukaanTabung(r, t);
                            System.out.println(nilai5);
                        } else if (cek2 == false) {
                            String hasil = ulang();
                            System.out.println(hasil);
                        }
                    } else {
                        String hasil = ulang();
                        System.out.println(hasil);
                    }
                    break;
                default:
            }
            if (menu == 6) {
                break;
            }
        }
    }
}
