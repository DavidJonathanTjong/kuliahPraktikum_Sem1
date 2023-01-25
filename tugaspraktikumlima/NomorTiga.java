package tugaspraktikumlima;

public class NomorTiga {
    public static void main(String[]args){
        int x;
        for(x =1; x<=20; x++){
            if(x%3 == 0 && x%6==0){
                System.out.println(x+" => Kelipatan Tiga dan Kelipatan Enam");
            }
            else if(x%3==0 && x%5==0){
                System.out.println(x+" => Kelipatan Tiga dan Kelipatan Lima");
            }
            else if(x%3 == 0){
                System.out.println(x+" => Kelipatan Tiga");
            }
            else if(x%5==0){
                System.out.println(x+" => Kelipatan Lima");
            }
            else if(x%6==0){
                System.out.println(x+" => Kelipatan Enam");
            }
           
            else{
                System.out.println(x);
            }
        }
    }
}
