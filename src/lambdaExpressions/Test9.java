package lambdaExpressions;
import java.util.List;
//import java.util.function.Predicate;

public class Test9 {

	public static void main(String[] args) {
		List<String> l=List.of("space","sun","shanu","vedha","java","darling","sharath","jaanu","vedha darling","shanu jaanu");
		l.stream().filter(k->k.length()>=5).forEach(System.out::println);
//		Predicate<String> p=k->{
//			return k.length()>=5;
//		};
//		p.test(String s);
	}
}
