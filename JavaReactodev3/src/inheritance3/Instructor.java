package inheritance3;

public class Instructor extends User{
	private String lessonname;
	

	public String getLessonname() {
		return lessonname;
	}

	public void setLessonname(String lessonname) {
		this.lessonname = lessonname;
	}
	public Instructor() {
		
	}

	public Instructor(int id, String name, String lastname, String lessonname) {
		super(id, name, lastname);
		this.lessonname = lessonname;
	}
}

