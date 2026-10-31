public class Question5 {
    public static void vowel(String str){
        //Character.toLowerCast()
        // charAt()
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));

            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch);
                count ++;
            }
        }
        System.out.println("Total vowel count is = " + count);
    }
    public static void main(String args[]){
        String str="AEROPLANE";
        //System.out.println(name.toUpperCase());
        vowel(str);
    }
    
}
