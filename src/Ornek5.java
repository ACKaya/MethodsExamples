import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        int sayi= scan.nextInt();
        for(int i=sayi;i>0;i-=5){
            System.out.println(i);

        }
    }
}
