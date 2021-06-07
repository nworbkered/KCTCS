
public class Employee {

	private long empID;
	private String firstName;
	private String lastName;
	
	
	public Employee() {
		
	}
	
	public Employee (long empID, String firstName, String lastName) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getEmpID() {
		return empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	
}
