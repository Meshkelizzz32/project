package project4;

public class Main {
//	private static RandomGenerationRodent gen=new RandomGenerationRodent();
	
	public static void main(String[] args) {
//		Rodent[] rodents=new Rodent[2];
//		
//		for(Rodent r:rodents) {
//			r=gen.next();
//			System.out.println(r+" : ");
//		
//		}
		Mouse mouse=new Mouse();
		System.out.println("Goodbye Mouse");
		mouse.dispose();
		
		Hamster hamster=new Hamster();
	    System.out.println("Goodbye Hamster");
		hamster.dispose();
	}

}
