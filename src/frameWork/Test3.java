package frameWork;

import java.util.Map;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Map<Integer,String> m=Map.of(101,"vedha",501,"shanu",401,"darling",601,"chinnu",301,"jaanu");
		System.out.println(m);
//		iterate using foreach loop
		Set sk=m.keySet();
			for(Object x:sk) {
				System.out.println(x+"\t"+m.get(x));
		}
	}
}
