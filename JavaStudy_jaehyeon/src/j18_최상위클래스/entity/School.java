package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	private String school_name;
	private String school_adress;
	private int student_total;
	private int teacher_total;
	private LocalDate school_anniversary;
	
	public School() {}

	public School(String school_name, String school_adress, int student_total, int teacher_total,
			LocalDate school_anniversary) {
		this.school_name = school_name;
		this.school_adress = school_adress;
		this.student_total = student_total;
		this.teacher_total = teacher_total;
		this.school_anniversary = school_anniversary;
	}

	
	
	
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getSchool_adress() {
		return school_adress;
	}
	public void setSchool_adress(String school_adress) {
		this.school_adress = school_adress;
	}
	public int getStudent_total() {
		return student_total;
	}
	public void setStudent_total(int student_total) {
		this.student_total = student_total;
	}
	public int getTeacher_total() {
		return teacher_total;
	}
	public void setTeacher_total(int teacher_total) {
		this.teacher_total = teacher_total;
	}
	public LocalDate getSchool_anniversary() {
		return school_anniversary;
	}
	public void setSchool_anniversary(LocalDate school_anniversary) {
		this.school_anniversary = school_anniversary;
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(school_adress, school_anniversary, school_name, student_total, teacher_total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(school_adress, other.school_adress)
				&& Objects.equals(school_anniversary, other.school_anniversary)
				&& Objects.equals(school_name, other.school_name) && student_total == other.student_total
				&& teacher_total == other.teacher_total;
	}

	
	
	
	@Override
	public String toString() {
		return "School [school_name=" + school_name + ", school_adress=" + school_adress + ", student_total="
				+ student_total + ", teacher_total=" + teacher_total + ", school_anniversary=" + school_anniversary
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
