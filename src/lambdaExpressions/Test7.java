package lambdaExpressions;

import java.util.List;
import java.util.function.Predicate;
interface Check{
	public boolean even(int n);
}
public class Test7 {
	public static void main(String[] args) {
		List<Integer> k=List.of(54,98,47,32,25);
		System.out.println("by stream");
		Check t=p->p%2==0;
		k.stream().filter(t::even).forEach(System.out::println);
		System.out.println("-------------------------------------");
//		this interface is provided by java people to reduce code length providing functional interface externally.
		Predicate<Integer> l=m->m%2==0;
		k.stream().filter(l::test).forEach(System.out::println);
	}
}
