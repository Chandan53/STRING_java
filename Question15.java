public class Question15 {

    public static void main(String[] args) {

        String str = "ABCDEFGHI";
        String result = "";

        for (int i = 0; i < str.length();i+=3) {
            String temp = str.substring(i, i + 3);
            if(temp.equals("ABC")){
                result+="GET";

            }
             else if(temp.equals("DEF")){
                result+="TTY";

            }
             else if(temp.equals("GHI")){
                result+="HHH";

            }

            //if (str.startsWith("ABC", i)) {
              //  result += "GET";
                //i += 3;
            //}
            //else if (str.startsWith("DEF", i)) {
                //result += "TET";
                //i += 4;
            //}
            //else if (str.startsWith("GHI", i)) {
                //result += "TYY";
                //i += 3;
            //}
            else {
                i++;
            }
        }

        System.out.println(result + " ");
    }
}
