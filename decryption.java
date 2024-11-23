public class decryption{
    public static String decrypt(String c, int k){
        String result="";
        for (int i = 0; i < c.length(); i++){
            char c1 = c.charAt(i);
            if (c1 != 32){
                int m = (int) c1 - 65;
                m = Math.floorMod((m-k), 26);
                m += 65;
                char p1 = (char) m;
                result += p1; 
            }else
            {
                result += c1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        String p = decrypt("ZHOFRPH WR PHRPHR ODQG", 3);
        System.out.println(p);
    }
}