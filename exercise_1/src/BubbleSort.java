public class BubbleSort{  
    
	public static void bubbleSort(int[] arr) {
		
        for(int i = 0; i < arr.length; i++) {	
        	for(int j = 1; j < (arr.length - i); j++) {  
        		if(arr[j-1] > arr[j]) {  
        			int temp = arr[j-1];  
        			arr[j-1] = arr[j];  
        			arr[j] = temp;  
        		}
        	}  
        }  
	}
	
    public static void main(String[] args) {  
    	
    	int arr[] ={19,81,32,17,-5,7,8};  
                 
    	System.out.println("Array Before Bubble Sort");  
    	for(int i = 0; i < arr.length; i++){  
    		System.out.print("[" + arr[i] + "] ");  
    	}  
    	
    	System.out.println();  
                  
    	bubbleSort(arr);  
                 
    	System.out.println("\nArray After Bubble Sort");  
    	
    	for(int i = 0; i < arr.length; i++){  
    		System.out.print("[" + arr[i] + "] "); 
    	}  
   
    }
    
} 