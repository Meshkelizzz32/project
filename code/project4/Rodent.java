package project4;

public class Rodent {
	private name nm=new name( " :my name is Rodent");
		
	
	private whatEat we=new whatEat (" :i eat something");
	
	 Rodent(){
	System.out.println("Rodent()");
}
	 protected void dispose() {
		 System.out.println("dispose() in Rodent");
		 nm.dispose();
		 we.dispose();
	 }
}