package lambdaExpressions;
interface A{
	public void m1();
}
public class Test1 {

	public static void main(String[] args) {
		A t=new A(){
			public void m1() {
				System.out.println("Ananymous m1 method");
			}
		};
		t.m1();
		System.out.println("------------------------------------------");
		A r=()->{
			System.out.println("Lambda expression m1 method");
		};
		r.m1();
	}

}
