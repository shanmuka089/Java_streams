package frameWork;
import java.util.List;
class Employee{
	int id;
	String name;
	int salary;
	Employee(int i, String n, int s){
		id=i;
		name=n;
		salary=s;
	}
	public String toString(){
		return "id="+id+"  name="+name+"  salary="+salary;
	}
}
public class Test8 {
	public static void main(String[] args){
		List<Employee> m=List.of(
				new Employee(101,"shanu",50000),
				new Employee(201,"vedha",10000),
				new Employee(801,"priya",7000),
				new Employee(601,"jaanu",25000),
				new Employee(301,"darling",40000),
				new Employee(501,"chinnu",30000));
		System.out.println(m);
		System.out.println("--------------------------------------");
		m.stream().map(k->{
			k.salary+=k.salary*0.1;
			return k;
		}).forEach(System.out::println);
	}
}
