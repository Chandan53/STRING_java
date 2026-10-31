public class Question13 {
    public static void sub(String str){
        for(int i=0;i<str.length();i++){
            String temp="";
            for(int j=i;j<str.length();j++){
                char ch=str.charAt(j);

                if(temp.contains(ch + "")){
                    break;
                }

                temp=temp+ch;
                System.out.print(temp + " , ");

            }
            
        }
    }
    public static void main(String args[]){
        String word="abcabcbb";
        sub(word);
    }

}
