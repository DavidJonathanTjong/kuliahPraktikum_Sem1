/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stokbarang;

import java.util.Scanner;

public class StokBarang {

    static int harga1 = 25000, harga2 = 55000, harga3 = 82000;
    static int stok1 = 0, stok2 = 0, stok3 = 0;

    public static void main(String[] args) {
        menuLogin();
        menuUtama();
    }

    public static void menuLogin() {
        String usnm = "admin", pass = "sukses";
        Scanner masukan = new Scanner(System.in);
        while (true) {
            System.out.println("======================= LOGIN =======================");
            System.out.print("Masukan username: ");
            String cekUsername = masukan.nextLine();
            System.out.print("Masukan password: ");
            String cekPass = masukan.nextLine();

            if (cekUsername.equals(usnm) && cekPass.equals(pass)) {
                System.out.println("Login sukses");
                break;
            } else {
                System.out.println("password anda salah");
            }
        }
    }

    public static void menuUtama() {
        int menu;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("====================== Dashboard Admin ======================");
            System.out.println("1. Stok Barang \n2. Tambah Stok Barang \n3. Hapus Stok Barang \n4. Update Harga \n5. Keluar");
            System.out.print("Pilih Menu: ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    stokBarang();
                    break;
                case 2:
                    menuTambah();
                    break;
                case 3:
                    menuHapus();
                    break;
                case 4:
                    menuUpdate();
                    break;
                case 5:
                    System.out.println("Terimakasih Admin");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak tersedia, Silahkan pilih menu lain");
            }

        } while (menu != 5);
    }

    public static void stokBarang() {
        System.out.println();
        System.out.println("Stok Barang Saat ini");
        System.out.println("1. Kaos    || " + stok1 + "  ||  " + harga1 + "/pcs");
        System.out.println("2. Kemeja  || " + stok2 + "  ||  " + harga2 + "/pcs");
        System.out.println("3. Jaket   || " + stok3 + "  ||  " + harga3 + "/pcs");
    }

    public static void menuTambah() {
        Scanner in = new Scanner(System.in);

        int pilMenu2;
        while (true) {
            menuBarang();
            pilMenu2 = in.nextInt();
            switch (pilMenu2) {
                case 1:
                    System.out.print("Tambah Berapa Stok Kaos : ");
                    int tmbhStok1 = in.nextInt();
                    stok1 = tambahStok(stok1, tmbhStok1);

                    stokBarang();
                    break;
                case 2:
                    System.out.print("Tambah Berapa Stok Kemeja : ");
                    int tmbhStok2 = in.nextInt();
                    stok2 = tambahStok(stok2, tmbhStok2);

                    stokBarang();
                    break;
                case 3:
                    System.out.print("Tambah Berapa Stok jaket : ");
                    int tmbhStok3 = in.nextInt();
                    stok3 = tambahStok(stok3, tmbhStok3);

                    stokBarang();
                    break;
                case 4:
                    menuUtama();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }

    public static void menuHapus() {
        Scanner in = new Scanner(System.in);

        int pilMenu3;
        while (true) {
            menuBarang();
            pilMenu3 = in.nextInt();
            switch (pilMenu3) {
                case 1:
                    System.out.print("Hapus Berapa Stok Kaos : ");
                    int krgStok1 = in.nextInt();
                    if (krgStok1 > stok1) {
                        System.out.println("Melebihi Stok yang tersedia");
                    } else {
                        stok1 = hapusStok(stok1, krgStok1);
                    }
                    stokBarang();
                    break;
                case 2:
                    System.out.print("Hapus Berapa Stok Kemeja : ");
                    int krgStok2 = in.nextInt();
                    if (krgStok2 > stok2) {
                        System.out.println("Melebihi Stok yang tersedia");
                    } else {
                        stok2 = hapusStok(stok2, krgStok2);
                    }
                    stokBarang();
                    break;
                case 3:
                    System.out.print("Hapus Berapa Stok Jaket : ");
                    int krgStok3 = in.nextInt();
                    if (krgStok3 > stok3) {
                        System.out.println("Melebihi Stok yang tersedia");
                    } else {
                        stok3 = hapusStok(stok3, krgStok3);
                    }
                    stokBarang();
                    break;
                case 4:
                    menuUtama();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }

    public static void menuUpdate() {
        Scanner in = new Scanner(System.in);

        int pilMenu4;
        while (true) {
            menuBarang();
            pilMenu4 = in.nextInt();
            switch (pilMenu4) {
                case 1:
                    System.out.print("Ubah harga kaos: ");
                    int ubahHarga1 = in.nextInt();
                    harga1 = ubahHarga1;

                    stokBarang();
                    break;
                case 2:
                    System.out.print("Ubah harga kemeja: ");
                    int ubahHarga2 = in.nextInt();
                    harga2 = ubahHarga2;

                    stokBarang();
                    break;
                case 3:
                    System.out.print("Ubah harga kemeja: ");
                    int ubahHarga3 = in.nextInt();
                    harga3 = ubahHarga3;

                    stokBarang();
                    break;
                case 4:
                    menuUtama();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }

    public static int tambahStok(int stok, int tmbhStok) {
        return stok + tmbhStok;
    }

    public static int hapusStok(int stok, int krgStok) {
        return stok - krgStok;
    }

    public static void menuBarang() {
        System.out.println();
        System.out.println("======================== Menu Barang ========================");
        System.out.println("1. Kaos \t2. Kemeja \t3. Jaket \t4. Kembali");
        System.out.print("Pilih menu: ");
    }
}