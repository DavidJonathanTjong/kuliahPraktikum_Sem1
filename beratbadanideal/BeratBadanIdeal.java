package beratbadanideal;

import java.util.Scanner;

public class BeratBadanIdeal {

    static Scanner input = new Scanner(System.in);

    public static void menuUtama() {
        while (true) {
            System.out.println("SELAMAT DATANG DI PROGRAM KETAHUI BERAT BADAN IDEAL");
            for (int i = 1; i <= 10; i++) {
                System.out.print("=====");
            }
            System.out.println();
            System.out.println("1. Status Berat Badan menggunakan BMI");
            System.out.println("2. Cek kebutuhan kalori anda per hari");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            int nomorMenu = input.nextInt();
            switch (nomorMenu) {
                case 1:
                    menuSatu();
                    break;
                case 2:
                    menuDua();
                    break;
                case 3:
                    break;
                default:
                    System.err.println("Menu tidak tersedia, Silahkan pilih lagi");
            }
            if (nomorMenu == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini");
                break;
            }
        }
    }

    public static void menuSatu() {
        double berat, tinggi1;
        int pilGender;
        while (true) {
            System.out.print("Masukan berat badan anda (Kg): ");
            berat = input.nextDouble();
            System.out.print("Masukan tinggi anda (cm): ");
            tinggi1 = input.nextDouble();
            if (berat > 0 && tinggi1 > 0) {
                break;
            } else {
                System.out.println("Masukan berat atau tinggi anda dengan benar");
            }
        }
        double hasilBMI = hitungBMI(berat, tinggi1);
        if (hasilBMI < 17) {
            System.out.println("Berdasarkan standar berat di indonesia");
            System.out.println("Berat badan anda termasuk kurus dengan kekurangan berat badan tingkat berat");

        } else if (hasilBMI >= 17 && hasilBMI < 18.5) {
            System.out.println("Berdasarkan standar berat di indonesia");
            System.out.println("Berat badan anda termasuk kurus dengan kekurangan berat badan tingkat rendah");
        } else if (hasilBMI >= 18.5 && hasilBMI < 25) {
            System.out.println("Berdasarkan standar berat di indonesia"
                    + ", berat badan anda normal");
        } else if (hasilBMI >= 25 && hasilBMI < 27) {
            System.out.println("Berdasarkan standar berat di indonesia");
            System.out.println("Berat badan anda termasuk gemuk dengan kelebihan berat badan tingkat ringan");
        } else if (hasilBMI >= 27) {
            System.out.println("Berdasarkan standar berat di indonesia");
            System.out.println("Berat badan anda termasuk gemuk dengan kelebihan berat badan tingkat berat");
        }

        while (true) {
            System.out.println("Pilih jenis kelamin anda");
            System.out.println("1. Pria\t2. Wanita");
            System.out.print("Pilih menu (1/2): ");
            pilGender = input.nextInt();
            if (pilGender == 1) {
                double hasilPria = cekBBIdealPria(tinggi1);
                System.out.println("Berat badan ideal untuk anda adalah " + hasilPria + " kg");
                if (berat == hasilPria) {
                    System.out.println("Selamat, anda telah mencapai berat badan ideal");
                } else {
                    String kondisiPria = hasilPria > berat ? "tambahkan berat anda" : "kurangi berat anda";
                    System.out.println("disarankan untuk " + kondisiPria);
                }
                break;
            } else if (pilGender == 2) {
                double hasilWanita = cekBBIdealWanita(tinggi1);
                System.out.println("Berat badan ideal untuk anda adalah " + hasilWanita + " kg");
                if (berat == hasilWanita) {
                    System.out.println("Selamat, anda telah mencapai berat badan ideal");
                } else {
                    String kondisiWanita = hasilWanita > berat ? "tambahkan berat anda" : "kurangi berat anda";
                    System.out.println("disarankan untuk " + kondisiWanita);
                }
                break;
            } else {
                System.out.println("Menu tidak tersedia, silahkan pilih lagi");
            }
            System.out.println();
        }
    }

    public static double hitungBMI(double berat, double tinggi) {
        double konv = tinggi / 100;
        double hasil = berat / (konv * konv);
        return hasil;
    }

    public static double cekBBIdealPria(double tinggi2) {
        int tinggiKonv = (int) tinggi2;
        double output = ((double) tinggiKonv - 100) - (((double) tinggiKonv - 100) * 10 / 100);
        return output;
    }

    public static double cekBBIdealWanita(double tinggi2) {
        int tinggiKonv = (int) tinggi2;
        double output = ((double) tinggiKonv - 100) - (((double) tinggiKonv - 100) * 15 / 100);
        return output;
    }

    public static void menuDua() {
        Scanner masukan = new Scanner(System.in);
        while (true) {
            String pilMen;
            System.out.println("Note: Untuk mendapatkan berat badan ideal silahkan pilih menu 1 terlebih dulu");
            System.out.println("==============================================================================");
            System.out.print("Apakah anda sudah mendapatkan berat badan ideal? (Y/N): ");
            pilMen = masukan.nextLine();
            if (pilMen.equalsIgnoreCase("Y")) {
                menuduaExtra();
                break;
            } else if (pilMen.equalsIgnoreCase("N")) {
                System.out.println("Silahkan pergi ke menu 1");
                break;
            } else {
                System.out.println("Harap masukan (Y/N) saja");
            }
        }    
    }
    
    public static void menuduaExtra(){
        System.out.print("Masukan berat badan ideal anda: ");
        double bbi = input.nextDouble();
        while (true) {
            System.out.println("Pilih jenis kelamin anda");
            System.out.println("1. Laki-laki\t 2. Wanita");
            System.out.print("Pilih menu (1/2): ");
            int pilMen = input.nextInt();
            if (pilMen == 1) {
                double hasilKalPria = hitungKaloriBBILaki(bbi);
                System.out.println("Kalori yang diperlukan untuk mencapai berat badan ideal yaitu " + hasilKalPria + " kkal");
                break;
            } else if (pilMen == 2) {
                double hasilKalWanita = hitungKaloriBBIWanita(bbi);
                System.out.println("Kalori yang diperlukan untuk mencapai berat badan ideal yaitu " + hasilKalWanita + " kkal");
                break;
            } else {
                System.out.println("Pilih menu dengan benar");
            }
        }
    }

    public static double hitungKaloriBBILaki(double bbi) {
        double output = 30 * bbi;
        return output;
    }

    public static double hitungKaloriBBIWanita(double bbi) {
        double output = 25 * bbi;
        return output;
    }

    public static void main(String[] args) {
        menuUtama();
    }
}
