package kodlamaIoRecap;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öðretmen eklendi :"  + user.getFirstName());
	}
	@Override
	public void delete(User user) {
		System.out.println("Öðretmen silindi :" + user.getFirstName());
	}
	@Override
	public void update(User user) {
		System.out.println("Öðretmen güncellendi :" + user.getFirstName());
	}
}
