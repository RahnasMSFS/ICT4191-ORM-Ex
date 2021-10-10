package lk.ac.vau.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private String ID;
	private String LastName;
	private String FirstMidName;
	private Date EntrollmentDate;
	
	@OneToMany(mappedBy = "student")
	private List<Entrollment>entrollments;
	
	public Student()   {}

	public Student(String iD, String lastName, String firstMidName, Date entrollmentDate,
			List<Entrollment> entrollments) {
		super();
		ID = iD;
		LastName = lastName;
		FirstMidName = firstMidName;
		EntrollmentDate = entrollmentDate;
		this.entrollments = entrollments;
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

	public Date getEntrollmentDate() {
		return EntrollmentDate;
	}

	public void setEntrollmentDate(Date entrollmentDate) {
		EntrollmentDate = entrollmentDate;
	}

	public List<Entrollment> getEntrollments() {
		return entrollments;
	}

	public void setEntrollments(List<Entrollment> entrollments) {
		this.entrollments = entrollments;
	}
}
