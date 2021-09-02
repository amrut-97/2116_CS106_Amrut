public class InsertionSort {
	
    public static void insertionSort(int arr[]) {  
    	
        for (int j = 1; j < arr.length; j++) {  
            int key = arr[j];  
            int i = j - 1;
            
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;
        }  
    }  
       
    public static void main(String a[]) {    
        int[] arr = {102,33,76,0,12,-1,53};    
        
        System.out.println("Array Before Insertion Sort");    
        for(int i = 0; i < arr.length; i++) {  
    		System.out.print("[" + arr[i] + "] ");  
    	}    
        System.out.println();    
            
        insertionSort(arr);    
           
        System.out.println("\nArray After Insertion Sort");    
        for(int i = 0; i < arr.length; i++) {  
    		System.out.print("[" + arr[i] + "] ");  
    	}  
    }    
}    