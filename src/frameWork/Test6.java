package frameWork;

import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<Integer> m=List.of(1,5,4,3,6,8);
		System.out.println(m);
		m.stream().map(k->{
			int f=1;
			for(int i=1; i<=k; i++)
				f*=i;
			return f;
		}).forEach(System.out::println);
	}

}
