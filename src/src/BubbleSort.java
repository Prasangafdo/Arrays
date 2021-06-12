package src;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 12, 201, 5, 6, 90, 31};
		
		for (int i = 0; i < arr.length-1; i++) {
		//	System.out.println("i "+i);
			for (int j = 0; j <arr.length-i-1; j++) {
			//	System.out.println(arr.length-i-1);
				
				if (arr[j] > arr[j+1])
	                {
					int temp = arr[j];
				// System.out.println(j);
              arr[j] = arr[j+1];
              arr[j+1] = temp;
			}
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
