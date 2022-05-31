package j17_static.Student;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student(1, "김재현");
		Student student1 = new Student(1, "김재현");
		Student student2 = new Student(1, "김재현");
		Student student3 = new Student(1, "김재현");
		
		System.out.println(student.toString());
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	
	}
}
