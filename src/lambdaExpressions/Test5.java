package lambdaExpressions;
interface M{
	public boolean odd(int n);
}
public class Test5 {

	public static void main(String[] args) {
		M a=n->{
			if(n%2!=0)
				return true;
			return false;
		};
		System.out.println(a.odd(82));
		System.out.println("-------------------------");
		M b=n->{
			return n%2!=0;
		};
		System.out.println(b.odd(43));
		System.out.println("---------------------------");
		M c=n->n%2!=0;
		System.out.println(c.odd(60));
	}

}
