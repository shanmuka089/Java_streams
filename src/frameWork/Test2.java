package frameWork;
import java.util.Set;
public class Test2 {
	public static void main(String[] args){
		Set<Integer> s=Set.of(12,65,68,23,13,7,98,6);
		System.out.println(s);
		System.out.println("print even numbers in the above set");
//		iterate using for each loop
		for(int i: s) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("-----------------------------------------------");
//		iterate using inbuit method
		s.stream().filter(Test2::check).forEach(System.out::println);
	}
	public static boolean check(int n)
	{
		return n%2==0;
	}
}
