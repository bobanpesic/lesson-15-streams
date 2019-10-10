
package exercises;

public class _1_SpiceWorld {
	/*
	 * Replace the anonymous inner class with a lambda expression.
	 */

	public static void main(String[] args) {
		SpiceGirl sporty = (() -> System.out.println("Do Backflip!"));
		sporty.perform();
	}

}

interface SpiceGirl {
	void perform();
}
