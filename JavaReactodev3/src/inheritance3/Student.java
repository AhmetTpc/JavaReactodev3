package inheritance3;

public class Student extends User {
	private String enterquiz;
	public Student() {
		
	}
	public Student(String enterquiz, String golesson) {
		super();
		this.enterquiz = enterquiz;
		this.golesson = golesson;
	}
	private String golesson;
	
	public String getEnterquiz() {
		return enterquiz;
	}
	public void setEnterquiz(String enterquiz) {
		this.enterquiz = enterquiz;
	}
	public String getGolesson() {
		return golesson;
	}
	public void setGolesson(String golesson) {
		this.golesson = golesson;
	}
	
	

}
