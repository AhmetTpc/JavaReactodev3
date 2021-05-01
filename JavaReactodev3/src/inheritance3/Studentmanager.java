package inheritance3;

public class Studentmanager extends Usermanager {
	@Override
	public void add(User manager) {
		System.out.println("Student added");
	}
	public void golesson(String lessonname) {
		System.out.println(lessonname+" dersine girildi ");
		
	}
	public void enterquiz(String quizname) {
		System.out.println(quizname+" quize girildi");
	}

}
