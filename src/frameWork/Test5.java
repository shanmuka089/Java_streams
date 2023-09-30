package frameWork;

import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<Integer> m=List.of(10,5,4,3,6,8);
		System.out.println(m);
		m.stream().map(k->k*k).forEach(System.out::println);
	}

}
