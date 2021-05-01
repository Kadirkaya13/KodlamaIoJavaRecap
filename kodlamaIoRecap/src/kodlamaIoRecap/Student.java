package kodlamaIoRecap;

public class Student extends User{
	
	private String educationLevel;
	private String takenLesson;
	
	public Student(int id, String firstName, String lastName, String email, String nationalIdentity, String password,
			String educationLevel, String takenLesson) {
		super(id, firstName, lastName, email, nationalIdentity, password);
		this.educationLevel = educationLevel;
		this.takenLesson = takenLesson;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getTakenLesson() {
		return takenLesson;
	}
	public void setTakenLesson(String takenLesson) {
		this.takenLesson = takenLesson;
	}
	
}
