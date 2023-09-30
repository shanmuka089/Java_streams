package frameWork;
import java.util.Iterator;
import java.util.List;
public class Test1 {
	public static void main(String[] args) {
//		Create collections in a single line
		List<String> l=List.of("shanu","vedha","priya","darling","chinnu");
//		print using own method
		l.stream().forEach(Test1::print);
		System.out.println("----------------------------------------------------");
//		print using inbuilt method
		l.stream().forEach(System.out::println);
		System.out.println("----------------------------------------------------");
//		print using Iterator
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void print(String s)
	{
		System.out.println(s);
	}
}
