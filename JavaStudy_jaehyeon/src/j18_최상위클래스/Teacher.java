package j18_최상위클래스;

import java.util.Objects;

/*
 * Object Class : 최상위 클래스
 * 모든 객체를 의미함
 * 
 * 
 */

public class Teacher {
	private String name;
	private String subject;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	public Teacher() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Teacher [이름=" + name + ", 과목=" + subject + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	
	public void classInfo() {
		//여기서 Teacher.class 는 getClass()와 동일
		System.out.println(Teacher.class.getSimpleName());
	}
	
	
	
	
	
	
	
	
	
	
	
}
