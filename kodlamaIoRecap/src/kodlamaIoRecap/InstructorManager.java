package kodlamaIoRecap;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("��retmen eklendi :"  + user.getFirstName());
	}
	@Override
	public void delete(User user) {
		System.out.println("��retmen silindi :" + user.getFirstName());
	}
	@Override
	public void update(User user) {
		System.out.println("��retmen g�ncellendi :" + user.getFirstName());
	}
}
