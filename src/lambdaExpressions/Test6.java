package lambdaExpressions;
interface Z{
	public boolean isPrime(int n);
}
public class Test6 {

	public static void main(String[] args) {
		Z a=n->{
			if(n<2)return false;
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		};
		System.out.println(a.isPrime(12));
	}

}
