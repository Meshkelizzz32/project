package project4;

public class Hamster extends Rodent{
	private name nm=new name(" :my name is Hamster");
	
	private whatEat we=new whatEat(" :i eat feed");
	
	 Hamster(){
			System.out.println("Hamster()");
	 }
	 
	 protected void dispose() {
		 System.out.println("dispose() in Hamster");
		 nm.dispose();
		 we.dispose();
		 super.dispose();
	 }

}
