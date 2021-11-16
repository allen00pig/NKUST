public class Factor {
    public static void main(String[] args) {
        for(int m = 1 ; m < 101 ; m++) {
            int i = m % 21;
            if (i == 0 ){
                System.out.println(m);
            }
        }
    }
}
