package frameWork;

import java.util.Set;

class Student
{
	String name;
	int roll;
	int marks;
	Student(String n,int r,int m){
		name=n;
		roll=r;
		marks=m;
	}
	public String toString() {
		return "name="+name+"  roll="+roll+"  marks="+marks;
	}
}
public class Test4 {

	public static void main(String[] args) {
		Set<Student> s=Set.of(new Student("shanu",101,67),
							new Student("vedha",701,66),
							new Student("priya",401,59),
							new Student("darling",501,69),
							new Student("jaanu",201,73));
		s.stream().filter(Test4::filtering).forEach(System.out::println);
	}
	public static boolean filtering(Student s)
	{
		return s.marks>=60;
	}

}
