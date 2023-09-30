package practicetsreams;

import java.util.List;

public class Stream1 {
	
	public static void main(String[] args) {		
		List<Integer> l=List.of(11,30,54,56,17,72,73,18,13,9);
		l.stream().filter(Stream1 :: even).map(Stream1 :: square).forEach(System.out:: println);
		l.stream().filter((n)->{
			if(n<2) {return false;}
			for(int i=2; i<=n/2; i++) {
				
				if(n%i==0)
					return false;
				}
				return true;
		}).forEach(System.out:: println);
		l.stream().map(n->{
			if(n%2==0)
				return n*n;
			else
				return n*n*n;
		}).forEach(System.out::println);
		l.stream().filter(n->n>=50).forEach(System.out::println);
		
	}
	public static boolean even(int n)
	{
		return n%2==0;
	}
	public static int square(int n)
	{
		return n*n;
	}
}


