package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	private String CourseID;
	private String Title;
	private int Credits;
	
	@OneToMany(mappedBy = "course")
	private List<Entrollment>entrollments;
	
	@ManyToOne
	@JoinColumn(name = "DepartmentID",referencedColumnName = "DepartmentID")
	private Department department;
	
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "courses")
	private List<Instructor>instructors;
	
	public Course() {}

	public Course(String courseID, String title, int credits, List<Entrollment> entrollments, Department department,
			List<Instructor> instructors) {
		super();
		CourseID = courseID;
		Title = title;
		Credits = credits;
		this.entrollments = entrollments;
		this.department = department;
		this.instructors = instructors;
	}

	public String getCourseID() {
		return CourseID;
	}

	public void setCourseID(String courseID) {
		CourseID = courseID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getCredits() {
		return Credits;
	}

	public void setCredits(int credits) {
		Credits = credits;
	}

	public List<Entrollment> getEntrollments() {
		return entrollments;
	}

	public void setEntrollments(List<Entrollment> entrollments) {
		this.entrollments = entrollments;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}
}
