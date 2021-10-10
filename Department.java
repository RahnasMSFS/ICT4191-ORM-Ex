package lk.ac.vau.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private String DepartmentID;
	private String Name;
	private double Budget;
	private Date StartDate;
	
	@OneToMany(mappedBy = "department")
	private List<Course>courses;
	
	@ManyToOne
	@JoinColumn(name = "InstructorID",referencedColumnName = "ID")
	private Instructor instructor;
	
	public Department()   {}

	public Department(String departmentID, String name, double budget, Date startDate, List<Course> courses,
			Instructor instructor) {
		super();
		DepartmentID = departmentID;
		Name = name;
		Budget = budget;
		StartDate = startDate;
		this.courses = courses;
		this.instructor = instructor;
	}

	public String getDepartmentID() {
		return DepartmentID;
	}

	public void setDepartmentID(String departmentID) {
		DepartmentID = departmentID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBudget() {
		return Budget;
	}

	public void setBudget(double budget) {
		Budget = budget;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
