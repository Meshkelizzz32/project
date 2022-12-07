package project4;

public class Mouse extends Rodent{
	private name nm=new name(" :my name is Mouse");
	
	private whatEat we=new whatEat(" :i eat corn");
	
	 Mouse(){
			System.out.println("Mouse()");
	 }
	 
	 protected void dispose() {
		 System.out.println("dispose() in Mouse");
		 nm.dispose();
		 we.dispose();
		 super.dispose();
	 }
}
