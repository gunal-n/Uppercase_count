

class uppercount {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("HEllo WE Are");
        int count = 0;
        for (int i = 0; i < sb.length(); i++){
             if(Character.isUpperCase(sb.charAt(i))){
                count++;
             }
        }
        System.out.println(count);
    }
}