class UnHash{

    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static long revHash(long hash) {
        long  a = hash ;
        long h = 0L;
        for (int i = 0; i < 20 ; i++){
            h = a % 23 ;
            a = (a - h) / 23;
            char ans = letters.charAt((int) h);
            System.out.println(ans);
            if(a == 7){
                break;
            }
        }
        return a;
    }
    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }

        return h;
    }
}