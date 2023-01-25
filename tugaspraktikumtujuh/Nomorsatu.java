package tugaspraktikumtujuh;

import java.util.Scanner;

public class Nomorsatu {

    static int inputAngka;

    static void plus_min_nol() {
        if (inputAngka == 0) {
            System.out.println(inputAngka + " bernilai nol");
        } else if (inputAngka > 0) {
            System.out.println(inputAngka + " bernilai positif");
        } else if (inputAngka < 0) {
            System.out.println(inputAngka + " bernilai negatif");
        }
    }

    static void ganjilgenap() {
        if (inputAngka % 2 == 0) {
            System.out.println(inputAngka + " bernilai genap");
        } else {
            System.out.println(inputAngka + " bernilai ganjil");
        }
    }

    static void inputulang() {
        System.out.print("Input bilangan: ");
        Scanner input = new Scanner(System.in);
        inputAngka = input.nextInt();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input bilangan: ");
        inputAngka = input.nextInt();
        int pilihMenu;
        do {
            System.out.println("Pilih menu\n1.Apakah bilangan bernilai positif/negatif/nol"
                    + "\t 2. Apakah bilangan genap atau ganjil\t3. Apakah ingin input ulang?\t4. Keluar");
            System.out.print("Masukan menu (1/2/3/4): ");
            pilihMenu = input.nextInt();
            switch (pilihMenu) {
                case 1:
                    plus_min_nol();
                    break;
                case 2:
                    ganjilgenap();
                    break;
                case 3:
                    inputulang();
                    break;
                case 4:
                    break;
            }
        } while (pilihMenu != 4);
    }

}
