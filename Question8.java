public class Question8 {
    public static void printnumber(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println(ch);
                count ++;

                }
            }
        System.out.println("Total count of number in a string is = " + count );
    }
    public static void main(String args[]){
        String password="Chandan@2003";
        printnumber(password);
    }
    
}
