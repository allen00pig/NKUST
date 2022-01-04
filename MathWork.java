public class MathWork {
    public static void main(String[] args) {
        int a = 0 , b =0 , c = 3 ,d = 0 , e = 0;
        for(int i = 0 ; i < 26 ; i = i + 1){
            b = (a * a) + b;
            a = a + 2;
        }
        for(int i = 0 ; i < 24 ; i = i + 1){
            d = (c * c) + d;
            c= c + 2;
        }
        e = b - d + 1;
        System .out.println(e);
    }
}
