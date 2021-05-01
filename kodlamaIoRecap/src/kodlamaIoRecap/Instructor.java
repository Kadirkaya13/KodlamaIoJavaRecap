package kodlamaIoRecap;

public class Instructor extends User{
	private String educationDepartment;
	private String lectureGiven;
	
	public Instructor(int id, String firstName, String lastName, String email, String nationalIdentity, String password,
			String educationDepartment, String lectureGiven) {
		super(id, firstName, lastName, email, nationalIdentity, password);
		this.educationDepartment = educationDepartment;
		this.lectureGiven = lectureGiven;
	}
	
	public String getEducationDepartment() {
		return educationDepartment;
	}
	public void setEducationDepartment(String educationDepartment) {
		this.educationDepartment = educationDepartment;
	}
	public String getLectureGiven() {
		return lectureGiven;
	}
	public void setLectureGiven(String lectureGiven) {
		this.lectureGiven = lectureGiven;
	}
}
