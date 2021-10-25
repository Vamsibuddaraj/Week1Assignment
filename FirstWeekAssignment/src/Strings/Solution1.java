package Strings;
import java.io.*;
import java.util.*;

public class Solution1 {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        
        int get_value=A.compareTo(B);
        if(get_value>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String FirstLetter=A.substring(0,1);
        String remLetter=A.substring(1);
        String FirstLetter1=B.substring(0,1);
        String remLetter2=B.substring(1);
        System.out.println(FirstLetter.toUpperCase()+remLetter+" "+FirstLetter1.toUpperCase()+remLetter2);
        
        
    }
}
