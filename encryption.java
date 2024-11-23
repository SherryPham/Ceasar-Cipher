public class encryption{
    public static String encrypt(String p, int k){
        String result="";
        p = p.toUpperCase();
        for (int i = 0; i < p.length(); i++){
            char p1 = p.charAt(i);
            if (p1 != 32){
                int m = (int) p1 - 65;
                m = Math.floorMod((m+k), 26);
                m += 65;
                char c1 = (char) m;
                result += c1; 
            }else
            {
                result += p1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        String c = encrypt("Welcome to MeoMeo land", 3);
        System.out.println(c);
    }
}