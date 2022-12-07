package project4;

public class name {
	private String s;
	name(String s){
		this.s=s;
		System.out.println("Creating name"+s);
		
	}
	protected void dispose() {
		System.out.println("Close name "+s);
	}
}
