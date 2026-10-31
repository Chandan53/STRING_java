public class Question7 {
    public static void specialchar(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isLetter(ch) && ! Character.isDigit(ch) && !Character.isWhitespace(ch)){
                System.out.println(ch);
                count++;

            }
        }
        System.out.println("Total no. of special character is = " + count);
    }
    public static void main(String args[]){
        String email="chandan@gmail.com";
        specialchar(email);
    }
    
}
