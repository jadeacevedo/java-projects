package a3;


import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) 
    {
        String s1,s2,s3, temp;
        Scanner kb = new Scanner (System.in);

        System.out.print("Enter first word:");
        s1 = kb.next();
        System.out.print("Enter second word:");
        s2 = kb.next();
        System.out.print("Enter third word:");
        s3 = kb.next();

        if (s1.compareTo(s2) > 0)
        {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }
        if (s2.compareTo(s3) > 0)
        {
            temp = s2;
            s2 = s3;
            s3 = temp;
        }
        System.out.println( "Alphabetical Order is " + "\n" + s1 +"\n" + s2 +"\n" + s3);
        kb.close();
    
}
}