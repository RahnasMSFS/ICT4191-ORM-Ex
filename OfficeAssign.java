package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OfficeAssign {

	@Id
	@GeneratedValue
	private Long ID;
	//when a table does not have a primary key
	
	
	private String Location;
	@OneToOne
	@JoinColumn(name = "Instructor_ID",referencedColumnName = "ID")
	private Instructor instructor;
	
	public OfficeAssign()
	{}

	public OfficeAssign(Long iD, String location, Instructor instructor) {
		super();
		ID = iD;
		Location = location;
		this.instructor = instructor;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
