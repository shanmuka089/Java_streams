package lambdaExpressions;
interface C
{
	public void m1(int a,int b);
}
public class Test3 {

	public static void main(String[] args) {
//		Anonymous inner class
		C c=new C() {
			public void m1(int a,int b) {
				System.out.println("sum is  "+(a+b));
			}
		};
		c.m1(33,44);
		System.out.println("---------------------------------");
//		Lambda expression
		C d=(n1,n2)->{
			System.out.println("sum is   "+(n1+n2));
		};
		d.m1(56,83);
		System.out.println("----------------------------------");
		C e=(n1,n2)->System.out.println("Sum is   "+(n1+n2));	
		e.m1(63,95);
	}

}
