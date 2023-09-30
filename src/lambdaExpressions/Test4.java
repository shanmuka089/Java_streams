package lambdaExpressions;
interface D{
	public boolean isBoolean(int n);
}
public class Test4 {

	public static void main(String[] args) {
		D a=n->{
			if(n%2==0)
				return true;
			else return false;
		};
		System.out.println(a.isBoolean(33));
		System.out.println("-----------------------------------");
		D b=n->{
			return n%2==0;
		};
		System.out.println(b.isBoolean(56));
		System.out.println("-------------------------------------");
		D d=n->n%2==0;
		System.out.println(d.isBoolean(45));
	}

}
