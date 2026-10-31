public class Question14 {
    public static void sub(String str){
        String substring="";
        int max=0;

        for(int i=0;i<str.length();i++){
            String temp="";
            for(int j=i;j<str.length();j++){
                char ch=str.charAt(j);

                if(temp.contains(ch+"")){
                    break;
                }

                temp=temp+ch;
                System.out.println("all substring are = " + temp);

                if(temp.length()>max){
                    max=temp.length();
                    substring=temp;
                    
                }
                
            }

        }
        System.out.println("Max length of a substring = " + max);
        System.out.println();
        System.out.println("Longest substring is = " + substring);

    }
    public static void main(String args[]){
        String str="abcabcbb";
        sub(str);
    }
    
}
