import java.util.*;
public class Question1{

    public static void main(String args[]){
        // input/output

        Scanner sc=new Scanner(System.in);

        String name;
        name=sc.next(); // it takes only single word
        System.out.println(name);

        sc.nextLine();// consume the left over line

        String full_name;
        full_name=sc.nextLine();
        System.out.println(full_name);

    }
}