import java.util.*;
public class menudriven {
public static void main(String args[]) {
	Scanner inn=new Scanner(System.in);
	menusg obj=new menusg();
	System.out.println("Enter a & b values");
	obj.setA(inn.nextInt());
	obj.setB(inn.nextInt());
	menumethods meth=new menumethods();
	System.out.println("Select your operator :");
	System.out.println("1. + ");
	System.out.println("2. -  ");
	System.out.println("3. *  ");
	System.out.println("4. /  ");
	char op=inn.next().charAt(0);
	switch(op) {
	case '+':
		meth.add(obj.getA(), obj.getB());
		break;
	case '-':
		meth.sub(obj.getA(), obj.getB());
		break;
	case '*':
		meth.mul(obj.getA(), obj.getB());
		break;
	case '/':
		meth.div(obj.getA(), obj.getB());
		break;	
	}
inn.close();
}
}
