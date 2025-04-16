public class ASCII {
    public static void main(String[] args) {
        String sb = new String("Hello");
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + "=" + ascii);
        }
    }
}
