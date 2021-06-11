package src;

public class ReverseString {

	public static void main(String[] args) {
		// Java reverse string
		
		String forward = "This is a string";
		
		char[] array = {};
		
		array = forward.toCharArray();
		
		System.out.println(array.length);
		
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}
//		
		for(int i=array.length-1;i>=0;i--)
			System.out.println(array[i]);
	}

}
