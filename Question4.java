public class Question4 {
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }

    }
    public static void main(String args[]){
        // iteration in string // print every charactaer from a word
        
        String full_name="Spider man";

        printletter(full_name);

    }
    
}
