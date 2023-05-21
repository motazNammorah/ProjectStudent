/// NAME:MOTAZ NAMMORA.
/// ID:1193288.
/// SEC:(7).
package ass2;
import java.util.Date;
public class Student {
    //private variables.
	private String FirstName;
	private String LastName;
	private int Id;
	private Date DateOfBirth;
	private int Grade;
	private String Email;
	//an no-argument constructor.
	public Student() {
   
	}
	// a constructor with arguments .
	public Student(String firstName, String lastName, int id, Date dateOfBirth) {

		FirstName = firstName;
		LastName = lastName;
		Id = id;
		DateOfBirth = dateOfBirth;
		
	}
	//method for getting and setting .
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	
	public String getEmail() {
		return getFirstName().charAt(0)+ getLastName()+"@ritaj.birzeit.edu";
	}



}