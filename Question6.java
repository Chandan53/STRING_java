public class Question6 {
    public static void consonent(String str){

        //Character.isLetter(ch) returns:
//- true → If the character is an alphabet (A–Z or a–z).
//- false → If it is a number, special character, or space.


        int count =0;
        for(int i=0;i<str.length();i++){
            char ch= Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(ch) && ch!='a' && ch!='e'&& ch !='i'&& ch!='o'&& ch!='u'){
                System.out.println(ch);
                count++;
            }

        }
        System.out.println("Total count of vowel is = " + count );
    }
    public static void main(String args[]){
        String name="Aeroplane   2";
        consonent(name);
    }
    
}
