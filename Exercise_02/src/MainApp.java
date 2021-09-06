public class MainApp {

	public static void main(String[] args) {
		
		int data[] ={134, 7, -22, 95, -5, 51};
       
        BubbleSort bubSort = new BubbleSort();
    	bubSort.bubbleSort(data);
    	   
        InsertionSort insSort = new InsertionSort();
    	insSort.insertionSort(data);
        
        SelectionSort selSort = new SelectionSort();
        selSort.selectionSort(data);
                 
	}

}
