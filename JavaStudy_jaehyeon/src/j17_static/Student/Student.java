package j17_static.Student;

public class Student {
	/*
	 * student_code(정수)
	 * student_name(이름)
	 * student_year(학년)
	 * 
	 * 학생을 한명 생성 할때마다 자동으로 student_code의 값이 1씩 증가하여,
	 * 부여될 수 있게 작성
	 * 
	 * 20220001
	 * 20220002
	 * 
	 */
	private static int auto_incremint = 20220000;
	private int student_code ;
	private int student_year;
	private String student_name;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int student_year, String student_name) {
		this.student_code += ++auto_incremint;
		this.student_year = student_year;
		this.student_name = student_name;
	}

	@Override
	public String toString() {
		return "Student [student_year=" + student_year + ", student_name=" + student_name + 
				" student_code = "+ student_code;
	}
	
//	public void shoiInfo() {
//		System.out.println("학번 : " +  student_code);
//		System.out.println("이름 : " +  student_name);
//		System.out.println("학년 : " +  student_year);
//	}
	
	
	
	

	
	
	
	
}
