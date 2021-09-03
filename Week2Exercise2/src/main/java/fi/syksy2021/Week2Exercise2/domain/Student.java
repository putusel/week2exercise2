package fi.syksy2021.Week2Exercise2.domain;

public class Student {

	private String student;

	
	public Student(String student) {
		this.student = student;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Student [student=" + student + "]";
	}
	
}