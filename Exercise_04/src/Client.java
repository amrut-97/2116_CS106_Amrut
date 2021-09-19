
public class Client {
	
	public static void main(String[] args) {   
	
		LinkedList list = new LinkedList();
		//list.updateAt(0, 0); // Displays error message when updating when list is empty
		//list.show();  // Displays error message list when its empty
		
		list.insert(11);
		list.insert(34);
		list.insert(25);
		list.insert(54);
		
		//list.show(); // shows 11 34 25 54
		
		list.updateAt(0, 0);
		list.updateAt(1, 3);
		list.updateAt(3, 0);
		
		//list.show();  // shows  0 3 25 0
		
		list.deleteAt(3);
		list.deleteAt(2);
		list.deleteAt(1);
		list.deleteAt(0);
		//list.deleteAt(0); displays error message list is empty
		
		//list.show(); //  Displays error message list when its empty
	}
}


