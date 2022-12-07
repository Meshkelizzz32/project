package project4;
import java.util.*;

public class RandomGenerationRodent {
private Random rand =new Random();
public Rodent next() {
	switch(rand.nextInt(2)) {
	default:
	case 0: return new Mouse();
	case 1: return new Hamster();
	}
}
}
