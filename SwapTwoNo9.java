//  9. SWAP TWO NUMBERS

package smartgraduates;

public class SwapTwoNo9 {
	public static void main(String[] agrs) {
		float first=2.50f,second=4.50f;
		System.out.println("--Before swap--");
		System.out.println("First number="+first);
		System.out.println("second number="+second);
		float temporary=first;
		first=second;
		second=temporary;
		System.out.println("--After swap--");
		System.out.println("First number="+first);
		System.out.println("second number="+second);
		}

}
