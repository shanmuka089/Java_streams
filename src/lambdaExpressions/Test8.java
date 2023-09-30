package lambdaExpressions;

import java.util.List;
//import java.util.function.Predicate;

public class Test8 {

	public static void main(String[] args) {
		List<String> l=List.of("space","sun","shanu","vedha","java","darling","sharath","jaanu","vedha darling","shanu jaanu");
		l.stream().filter(k->k.charAt(0)=='s').forEach(System.out::println);
//		Predicate<String> p=k->{
//			return k.charAt(0)=='s';
//		};
//		p.test(String s);
	}
}
