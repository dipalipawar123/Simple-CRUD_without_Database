package employee;

public class Employee {
	private int ID;
	private String First_Name;
	private String Last_Name;
	private String email;
	private int Age;



	public Employee(int iD, String first_Name, String last_Name, String email, int age) {
		super();
		ID = iD;
		First_Name = first_Name;
		Last_Name = last_Name;
		this.email = email;
		Age = age;
	}

	public int getID() {
		
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", email=" + email
				+ ", Age=" + Age + "]";
	}
	

}
