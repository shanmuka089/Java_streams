package lambdaExpressions;
interface B{
	public void m1(int m);
}
public class Test2 {

	public static void main(String[] args) {
//		Ananymous inner class
		B a=new B() {
			public void m1(int n) {
				System.out.println("the square is  "+(n*n));
			}
		};
		a.m1(10);
		System.out.println("----------------------------------");
//		lambda expressions
		B b=(n)->{
			System.out.println("the square is  "+(n*n));
		};
		b.m1(9);
		System.out.println("------------------------------------");
//		lambda expression in oneline
		B c=n->System.out.println("the sauare is  "+(n*n));
		c.m1(8);
	}

}
