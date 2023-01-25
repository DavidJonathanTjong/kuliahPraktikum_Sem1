package tugaspraktikumdua;

public class Soalnomorempat {
    public static void main (String[]args){
        double r = 23.12;
        final double PI = 3.141592;
        double luas = (PI*r*r);
          
        int pembulatan = (int) Math.round (luas);
        int bulat = (int) luas;
        System.out.println("Luas lingkaran =  " + bulat);
    }
}
