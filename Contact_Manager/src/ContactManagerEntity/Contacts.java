package ContactManagerEntity;

public class Contacts {
	
	private int id;
	private String Fname;
	private String Lname;
	private long phone;
	private long work;
	private String email;
	
	
	
	// Non-parameterized Constructor 
	public Contacts() {
		super();
	}

	// parameterized Constructor 
	public Contacts(int id, String fname, String lname, long phone, long work, String email) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.phone = phone;
		this.work = work;
		this.email = email;
	}

	
	// all Helper method 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getWork() {
		return work;
	}

	// toString() method 
	@Override
	public String toString() {
		System.out.println();
		return "Contacts [Fname=" + Fname + ", Lname=" + Lname + ", phone=" + phone + ", work=" + work + ", email="
				+ email + "]";
	}

	public void setWork(long work) {
		this.work = work;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	

}
