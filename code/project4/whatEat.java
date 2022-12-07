package project4;

public class whatEat {
	private String s;
	whatEat(String s){
		this.s=s;
		System.out.println("Creating whatEat"+s);
	}
	protected void dispose() {
		System.out.println("Close whatEat "+s);
	}
}
