public class InsertionSort {
	
	public void insertionSort(int arr[]) { 
		
		System.out.println("\n=====START OF INSERTION SORT======");
    	
		System.out.println("\nArray Before Insertion Sort");
		print(arr);
		
        for (int j = 1; j < arr.length; j++) {  
            int temp = arr[j];  
            int i = j - 1;
            
            while ( (i > -1) && ( arr [i] > temp ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            } 
            arr[i+1] = temp;
        }
        
        System.out.println("\nArray After Insertion Sort");
        print(arr);
        
        System.out.println("\n=====END OF INSERTION SORT======\n");
    }
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print("[" + arr[i] + "] ");
		
		System.out.println();
	}
}
