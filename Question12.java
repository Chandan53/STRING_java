public class Question12 {
    public static String substring(String str, int si, int ei){
        String substring="";
        for(int i=si;i<ei;i++){
            substring+=str.charAt(i);

        }
        return substring;

    }
    public static void main(String args[]){
        String word ="Helloworld";
        System.out.println(substring(word,2,9));
    }
    
}
