import java.util.*;
public class Main {
	public static void main(String[] args) {
		int n;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
if(n%4==0)
n=n+1;
else
	n=n-1;
System.out.println(n);
}
}