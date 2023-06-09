public class Ornek2 {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }
    static int fib(int a){
        if(a==1||a==2){
            return 1;
        }


    return fib(a-1)+fib(a-2);
    }
}
