public class Ornek3 {
    public static void main(String[] args) {
        System.out.println(ustAlma(4,2));

    }
    static int ustAlma(int ust,int taban){
        int a=1;
        if(ust==0){
            return 1;
        }

        return ustAlma(ust-1,taban)*taban;


    }
}
