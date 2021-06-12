package src;

public class ReverseString {

	public static void main(String[] args) {
		// Java reverse string
		
		String forward = "This is a string";
		
		char[] array = {};
		
		array = forward.toCharArray();
		
		System.out.println(array.length);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);//Printing forward
		}
		
		System.out.println();
		
		for(int i=array.length-1;i>=0;i--) {//Printing backwards
			System.out.print(array[i]);
		}
		
		int[] arr = {10, 12, 201, 5, 6, 90, 31};
		
		int max = arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i;j<arr.length-i;j++) {
//				if(arr[i]>arr[i+1]) {
//					max = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = max;
//				}
//			}	
//		}
		
		//int n = arr.length;
       
		
//		for (int i = 0; i < arr.length-1; i++)
//            for (int j = 0; j < arr.length-i-1; j++)
//                if (arr[j] > arr[j+1])
//                {
//                    // swap arr[j+1] and arr[j]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//		
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
		

		

	}
	

}
