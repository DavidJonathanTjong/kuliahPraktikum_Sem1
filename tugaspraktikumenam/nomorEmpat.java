package tugaspraktikumenam;

import java.util.Scanner;

public class nomorEmpat {
    
    public static void main(String[] args) {
        String usnm, pass;
        int menu;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        while (true) {
            System.out.println("MENU LOGIN \n 1. LOGIN\t 2. DAFTAR");
            System.out.print("Pilih menu: ");
            menu = input1.nextInt();
            if (menu == 2) {
                System.out.print("Masukan username: ");
                usnm = input2.nextLine();
                System.out.print("Masukan pass: ");
                pass = input2.nextLine();
                if (true) {
                    switch (usnm) {
                        case "david jonathan tjong":
                            break;
                        default:
                    }
                    switch (pass) {
                        case "2211016310007":
                            break;
                        default:
                    }
                }
            } else if (menu == 1) {
                System.out.println("\nMasukkan Username dan Password");
                System.out.print("Masukan username : ");
                usnm = input2.nextLine();
                System.out.print("Masukan pass: ");
                pass = input2.nextLine();

                if (usnm.equals("david jonathan tjong") && pass.equals("2211016310007")) {
                    System.out.println(usnm + " " + pass + " Login Sukses");
                    break;
                } else {
                    System.out.println("Anda belum mendaftar, mohon login kembali");
                }
            }
        }
    }
}
