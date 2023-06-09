import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        int sayi= scan.nextInt();
        palindrom(sayi);

    }
    static int palindrom(int sayi){
        if(sayi==0){
            System.out.println(sayi);
            return sayi;

        }
        sayi/=10;
        System.out.println(sayi);
        return palindrom(sayi);

    }

}
