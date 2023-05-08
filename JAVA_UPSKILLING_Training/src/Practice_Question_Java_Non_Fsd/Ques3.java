package Practice_Question_Java_Non_Fsd;

import java.util.Scanner;

public class Ques3 {
public static void main(String[] args) {
	 
	Scanner sc =new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if(a>b) {
		System.out.println(a+ " is greator than  "+b);
	}
	if(a<b) {
		System.out.println(a+" is smaller than  "+b);
	}
	if(a==b) {
		System.out.println(a+" is equal to b "+b);
	}
}
}
