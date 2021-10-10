package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Entrollment {

	@Id
	private String EID;
	private String Grade;
	
	@ManyToOne
	@JoinColumn(name = "StudentID",referencedColumnName = "ID")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "CourseID",referencedColumnName = "CourseID")
	private Course course;

	public Entrollment(String eID, String grade, Student student, Course course) {
		super();
		EID = eID;
		Grade = grade;
		this.student = student;
		this.course = course;
	}

	public String getEID() {
		return EID;
	}

	public void setEID(String eID) {
		EID = eID;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
