package kodlamaIoRecap;

public class Main {

	public static void main(String[] args) {
		Student kadir = new Student(1,"Kadir","Kaya","kadirkaya@gmail.com",
				"115616515641","12345","�niversite","Java"); 
		Instructor engin = new Instructor(1,"Engin", "Demiro�", "engin.demirog@gmail.com",
				"151564565454", "12345", "Nitelikli yaz�l�mc� geli�tirme", "Java");
		
		StudentManager studentManager =new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(kadir);
		instructorManager.add(engin);
	}

}
