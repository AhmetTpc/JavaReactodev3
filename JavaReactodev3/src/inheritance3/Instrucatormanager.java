package inheritance3;

public class Instrucatormanager extends Usermanager{
	@Override 
	public void add(User manager) {
		System.out.println(manager.getId()+" "+manager.getName() +" ");
	}
	
	public void lessonadd(String lassonname) {
		System.out.println(" dersi eklendi");
	
}
}
