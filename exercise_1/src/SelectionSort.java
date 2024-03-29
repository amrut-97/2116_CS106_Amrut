public class SelectionSort {  
	
    public static void selectionSort(int[] arr) {
    	
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
    }  
       
    public static void main(String a[]) {

    	int[] arr = {9,14,3,2,43,11,58,22};
    	
    	System.out.println("Array Before Selection Sort");  
        for(int i = 0; i < arr.length; i++) {  
    		System.out.print("[" + arr[i] + "] ");  
    	} 
        System.out.println();  
          
        selectionSort(arr);  
         
        System.out.println("\nArray After Selection Sort");  
        for(int i = 0; i < arr.length; i++) {  
    		System.out.print("[" + arr[i] + "] ");  
    	}  
    }  
}  