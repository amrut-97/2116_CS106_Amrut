public class SelectionSort {
	
	public void selectionSort(int[] arr) {
		
		System.out.println("\n=====START OF SELECTION SORT======");
		
		System.out.println("\nArray Before Selection Sort");
		print(arr);
		
        for (int i = 0; i < arr.length - 1; i++) {  
            int index = i;
            
            for (int j = i + 1; j < arr.length; j++) {  
                if (arr[j] < arr[index]) {  
                    index = j;
                }  
            } 
            int temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;  
        }
        
        System.out.println("\nArray After Selection Sort");
        print(arr);
        
        System.out.println("\n=====END OF SELECTION SORT======\n");
    }
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print("[" + arr[i] + "] ");
		
		System.out.println();
	}
}
