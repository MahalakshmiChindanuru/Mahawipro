import java.util.*;
public class calculatortest {
	public static  void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a and b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculator obj=new calculator();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
		obj.div(a,b);
		sc.close();
	}

}
