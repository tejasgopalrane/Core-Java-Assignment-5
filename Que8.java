import java.util.Scanner;

public class Que8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine(),s1="";
	s=s.toLowerCase();
	int i;
	for(i=s.length()-1;i>=0;i--)
		s1=s1+s.charAt(i);
	System.out.println(s1);
	sc.close();
}
}