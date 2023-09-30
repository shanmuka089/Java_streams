package frameWork;

import java.util.List;

public class Test9 {
	public static void main(String[] args) {
		List<Employee> m=List.of(
				new Employee(101,"shanu",50000),
				new Employee(201,"vedha",10000),
				new Employee(801,"priya",70000),
				new Employee(601,"jaanu",25000),
				new Employee(301,"darling",40000),
				new Employee(501,"chinnu",30000));
		System.out.println(m);
		m.stream().map(k->{
			k.salary+=k.salary*0.15;
			return k;
		}).filter(k->(k.salary>=50000)).forEach(System.out::println);
	}

}
