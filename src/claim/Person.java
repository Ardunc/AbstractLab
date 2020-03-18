package claim;

public abstract class Person {
	
	private String firstName;
	private String lastName;
	
	public abstract double taxes(double amount);
	
	public abstract double calculatePhoneBill(double owed);
	
	public abstract double calculateOtherBills(double owed);
	
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
