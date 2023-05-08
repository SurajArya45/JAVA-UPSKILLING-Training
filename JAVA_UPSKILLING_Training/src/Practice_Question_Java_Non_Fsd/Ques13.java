package Practice_Question_Java_Non_Fsd;

import java.util.Scanner;


  public class Ques13 { public static void main(String[] args) { //Scanner sc =
  new Scanner(System.in); //String s = sc.next();
 String s = "abc",str ="";
    char ch;
	
    for (int i=0; i<s.length(); i++)
    {
      ch= str.charAt(i); 
      str= ch+str; 
    }
      System.out.println("Reversed word: "+ str);
}
}
