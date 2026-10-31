public class Question11 {
    public static void main(String args[]){

        String s1="Tony";
        String s2="Tony";// s2 pointing to old Tony which is created by s1
        String s3= new String("Tony");// it is creating to new in terms of object level

        if(s1== s2){// object level it is same  or not checking
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s1==s3){// having different object that is why giving !=
            System.out.println("S1 is equal to s3");
        }
        else{
            System.out.println("s1 != s3");
        }



        if(s1.equals (s3)){// h.equals()is chacking the value is equal or not 
        // it is not checking in object level
        // .equals() return boolean value
            System.out.println("S1 is equal to s3");
        }
        else{
            System.out.println("s1 != s3");
        }

    }
    
}
