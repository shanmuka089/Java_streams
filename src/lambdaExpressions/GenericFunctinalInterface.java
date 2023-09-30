package lambdaExpressions;

public class GenericFunctinalInterface {
	public static void main(String[] args) {
//		for integers
	GenericInterface1<Integer> i= (n1,n2)->n1+n2;
	System.out.println(i.addition(10,20));
	
//	for strings
	GenericInterface1<String> s=(s1,s2)->s1+s2;
	System.out.println(s.addition("shanmuka ","sharma"));

// for Square of the number
	GenericInterface2<Integer> m=(n)->n*n;
	System.out.println(m.Square(10));
	
//	for divison the number
	GenericInterface3<Integer> x=(i1,i2)->(i1/i2);
	System.out.println(x.Divison(64,8));
		
	}
}
