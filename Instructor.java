package lk.ac.vau.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

public class Instructor {

	private String ID;
	private String LastName;
	private String FirstMidName;
	private Date HireDate;
	
	@OneToMany(mappedBy = "instructor")
	private List<Department> departments;
	
	@OneToOne(mappedBy = "instructor")
	private OfficeAssign officeAssign;
	
	@ManyToMany
	@JoinTable(name = "instructor_course",joinColumns = {@JoinColumn(name = "instructor_id",referencedColumnName = "ID")},inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "CourseID")})
	
	private List<Course>courses;
	
	public Instructor()  {}

	public Instructor(String iD, String lastName, String firstMidName, Date hireDate, List<Department> departments,
			OfficeAssign officeAssign, List<Course> courses) {
		super();
		ID = iD;
		LastName = lastName;
		FirstMidName = firstMidName;
		HireDate = hireDate;
		this.departments = departments;
		this.officeAssign = officeAssign;
		this.courses = courses;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstMidName() {
		return FirstMidName;
	}

	public void setFirstMidName(String firstMidName) {
		FirstMidName = firstMidName;
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public OfficeAssign getOfficeAssign() {
		return officeAssign;
	}

	public void setOfficeAssign(OfficeAssign officeAssign) {
		this.officeAssign = officeAssign;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
