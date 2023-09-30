package frameWork;

import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		
	List<Integer> m=List.of(1,5,4,3,6,8);
	System.out.println(m);
	m.stream().map(k->{
		if(k%2==0)
			return k*k;
		else
			return k*k*k;
	}).forEach(System.out::println);
	System.out.println("--------------------------------------------");
	m.stream().map(l->l%2==0? l*l: l*l*l).forEach(System.out::println);

	}
}