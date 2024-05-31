package functinalInterface;
@FunctionalInterface
public interface MyFunctionalInterface {

	void m1();
	
	default void hit() {
		System.out.println("");
	}
}
