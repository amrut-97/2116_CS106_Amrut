public class BubbleSort {
	
	public void bubbleSort(int[] arr) {
		
		System.out.println("=====START OF BUBBLE SORT======");
		
		System.out.println("\nArray Before Bubble Sort");
		print(arr);
		
        for(int i = 0; i < arr.length; i++) {	
        	for(int j = 1; j < (arr.length - i); j++) {  
        		if(arr[j-1] > arr[j]) {  
        			int temp = arr[j-1];  
        			arr[j-1] = arr[j];  
        			arr[j] = temp;  
        		}
        	}  
        }
        
        System.out.println("\nArray After Bubble Sort");
        print(arr);
        
        System.out.println("\n=====END OF BUBBLE SORT======\n");
        
	}
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print("[" + arr[i] + "] ");
		
		System.out.println();
	}
}
