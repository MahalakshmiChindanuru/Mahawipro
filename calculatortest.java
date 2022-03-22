import java.util.*;
public class calculatortest {
	public static  void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		calci cin=new calci();
		System.out.println("enter the a and b values");
	    cin.setA(sc.nextInt());
		cin.setB(sc.nextInt());
		calculator obj=new calculator();
		obj.add(cin.getA(),cin.getB());
		obj.sub(cin.getA(),cin.getB());
		obj.mul(cin.getA(),cin.getB());
		obj.div(cin.getA(),cin.getB());
		sc.close();
	}

}
