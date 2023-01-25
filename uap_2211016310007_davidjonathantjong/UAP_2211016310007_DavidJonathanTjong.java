package uap_2211016310007_davidjonathantjong;

import java.util.Scanner;

public class UAP_2211016310007_DavidJonathanTjong {
    
    static Scanner input = new Scanner(System.in);
    static String usnm, pass;

    public static void menuLogin() {
        Scanner masuk1 = new Scanner(System.in);
        Scanner masuk2 = new Scanner(System.in);
        while (true) {
            System.out.println("SILAHKAN LOGIN TERLEBIH DAHULU");
            System.out.println("MENU LOGIN \n1. Login\t2. Daftar");
            System.out.print("Pilih menu: ");
            int menuLog = input.nextInt();
            switch (menuLog) {
                case 2:
                    System.out.print("Masukan username: ");
                    usnm = masuk1.nextLine();
                    System.out.print("Masukan password: ");
                    pass = masuk2.nextLine();
                    break;
                default:
            }
            if (menuLog == 1) {
                System.out.print("Masukan username: ");
                String cekUsername = masuk1.nextLine();
                System.out.print("Masukan password: ");
                String cekPass = masuk2.nextLine();

                if (cekUsername.equals(usnm) && cekPass.equals(pass)) {
                    System.out.println("Login sukses");
                    break;
                } else {
                    System.out.println("Anda belum daftar atau password anda salah");
                }
            }
        }
    }

    public static void menuUtama() {
        final int laprakSemSatu = 10;
        int mainMenu;
        do {
            System.out.println("SELAMAT DATANG DI PROGRAM CEK SAHAM PEMULA VER-"+laprakSemSatu);
            System.out.println("PILIHAN MENU\n1. Cek kategori saham berdasarkan nilai market cap\t2. Analisis laporan keuangan perusahaan (rasio)"
                    + "\t3. Hitung nilai rupiah saham yang anda punya \n4. hitung keuntungan dividen berbentuk tunai dari saham \t 5. Keluar");
            System.out.print("Pilih menu: ");
            mainMenu = input.nextInt();
            switch (mainMenu) {
                case 1:
                    menuSatu();
                    break;
                case 2:
                    menuDua();
                    break;
                case 3:
                    menuTiga();
                    break;
                case 4:
                    menuEmpat();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menjalankan aplikasi ini\nUntuk menambah wawasan disarankan "
                            + "untuk membaca buku Warren Buffett");
                    break;
                default:
                    System.out.println("menu tidak tersedia, silahkan pilih menu lain");
            }
        } while (mainMenu != 5);
    }

    public static int hitungSaham( int lotShm, int hargaShm) {        
        return hargaShm * 100 *lotShm;
    }
    
    public static double hitungUntung (double divHarga, double divYield){
        double output = divYield /100 * divHarga;
        return output;
    }
    
    public static void marketCap(double nilaiMarketCap){
        if(nilaiMarketCap > 50){
            System.out.println("Ini merupakan kategori saham blue chip /lapis pertama");
            System.out.println("Cocok untuk investasi jangka panjang maupun trading jangka pendek");
        }
        else if(nilaiMarketCap <= 50 && nilaiMarketCap >= 10){
            System.out.println("Ini merupakan kategori saham middle cap /lapis kedua");
        }
        else{
            System.out.println("Ini merupakan kategori saham small cap /lapis ketiga");
        }
    }
    
    public static void analisisEPS(double nilaiEPS){
        System.out.println("EPS = keuntungan bersih suatu perusahaan selama periode laporan keuangan per lembar"
                + " sahamnya \nSemakin besar EPS maka semakin baik"
                + ", untuk EPS tidak ada batasannya");
    }
    
    public static void analisisPER(double nilaiPER){
        if (nilaiPER>=20){
            System.out.println("Harga saham sudah mahal");
        }
        else if (nilaiPER >15 && nilaiPER<20){
            System.out.println("Harga saham cukup mahal");
        }
        else if (nilaiPER<=15 && nilaiPER>=10){
            System.out.println("Harga saham masih wajar");
        }
        else if (nilaiPER >=0 && nilaiPER<10){
        System.out.println("Harga saham murah");
        System.out.println("Menurut Warren Buffet atatupun Charlie mereka membeli sekitar 5-7%");
        }
        else{
            System.out.println("Saham tersebut mengalami rugi bersih");
        }
        System.out.println("PER yang tinggi seringkali dimaafkan dengan ROE yang tinggi");
        System.out.println("murah mahalnya suatu harga kembali lagi tergantung pandangan anda mengenai perusahaan tersebut");
    }
    
    public static void analisisPBV(double nilaiPBV){
        if(nilaiPBV >=1){
            System.out.println("Harga saham berdasarkan nilai pasar lebih tinngi");
        }
        else if(nilaiPBV<1 && nilaiPBV >=0){
            System.out.println("Harga pasar lebih kecil dari nilai jual sesungguhnya");
            System.out.println("Semakin kecil semakin baik");
        }
        else{
            System.out.println("Hindari PBV negatif");
        }       
    }
    
    public static void analisisROE(double nilaiROE){
        System.out.println("Menurut standar ROE Phill Town");
        if(nilaiROE>=15){
            System.out.println("efensiensi manajamen di atas standar");
        }
        if(nilaiROE<15){
            System.out.println("efensiensi manajemen di bawah standar");
        }
    }
    
    public static void analisisDER(double nilaiDER){
        if(nilaiDER == 100){
            System.out.println("hutangnya sama dengan modalnya");
        }
        if (nilaiDER <100 && nilaiDER >0){
            System.out.println("Hutangnya lebih kecil daripada modalnya");
        }
        if(nilaiDER >100){
            System.out.println("Hutangnya lebih besar daripada modalnya");
        }
        if(nilaiDER <=0){
            System.out.println("perusahaan mengalami akumulasi kerugian yang melebihi jumlah ekuitasnya.");
        }
        System.out.println("Semakin besar nilai DER (hutang yang lebih besar dari modal) maka akan semakin tinggi risikonya");
    }      
    
    public static void analisisDY(double nilaiDY){
        if(nilaiDY >5){
            System.out.println("memiliki dividen yield yang ideal");
        }
        if(nilaiDY<0){
            System.out.println("dividen yield tidak mungkin negatif");
        }
        else{
            System.out.println("dividen yield yang kurang ideal atau hanya rata-rata");
        }
    }
           
    public static void menuSatu(){
            System.out.print("Masukan nilai market cap saham perusahaan yang anda miliki (triliun): ");
            double nilaiMarketCap = input.nextDouble();
            System.out.println("Rentang dalam menentukan kategori saham disini bersumber dari @ngertisaham ");
            marketCap(nilaiMarketCap);
    }
    
    public static void menuDua(){
        System.out.print("Input EPS (Earning Per Share): ");
        double nilaiEPS = input.nextDouble();
        analisisEPS(nilaiEPS);
        System.out.print("Input PER (Price Earning Ratio): ");
        double nilaiPER = input.nextDouble();
        analisisPER(nilaiPER);
        System.out.print("Input PBV (Price to Book Value): ");
        double nilaiPBV= input.nextDouble();
        analisisPBV(nilaiPBV);
        System.out.print("Input ROE (Return on Equity): ");
        double nilaiROE = input.nextDouble();
        analisisROE(nilaiROE);
        System.out.print("Input DER (Debt to Equity): ");
        double nilaiDER = input.nextDouble();
        analisisDER(nilaiDER);
        System.out.print("Input Dividen Yield: ");
        double nilaiDY = input.nextDouble();
        analisisDY(nilaiDY);
        System.out.println("Ketika ingin mengetahui labanya, lihat EPS");
        System.out.println("Ketika ingin mengetahui seberapa wajar harga yang ditawarkan, lihat PER dan PBV");
        System.out.println("Ketika ingin mengetahui efensiensi manajemen, lihat ROE");
        System.out.println("Ketika ingin mengetahui risiko perusahaannya, lihat DER");
        System.out.println("Ketika ingin mengetahui seberapa royal perusahaan, lihat Dividen Yieldnya");
    }

    public static void menuTiga() {     
            System.out.print("Input berapa lot saham yang anda punya: ");
            int lotShm = input.nextInt();
            System.out.print("Input harga saham (Indicative Equilibrium Price/Volume) yang anda telah input: ");
            int hargaShm = input.nextInt();
            int totalHarga = hitungSaham(lotShm, hargaShm);
            System.out.println("Nilai rupiah saham anda adalah: "+totalHarga);                   
    }
    
    public static void menuEmpat(){
        System.out.print("Input berapa nilai rupiah saham anda : ");
        double divHarga = input.nextDouble();
        System.out.print("Input dividen yield saham yang anda telah input: ");
        double divYield = input.nextDouble();
        System.out.println("Keuntungan perusahaan yang dibagi ke anda adalah rp."+hitungUntung(divHarga, divYield));
    }
    
    public static void main(String[] args) {
        menuLogin();
        menuUtama();
    }
}
