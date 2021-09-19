
public class LinkedList {
	
Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next =  node;
		}
		
	}
	
	public void insertAtStart(Integer data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;
	}
	
	public void insertAt(Integer index, Integer data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void updateAt(Integer index, Integer data) {
		if(index == 0) {
			if(head == null) {
				System.out.println("Error! No element at index zero! Please enter an element then try to update it.");
				return;
			}else {
				Node n = head;
				n.data = data;
			}
		} else {
			Node n = head;
			for(int i = 0; i < index; i++){
				n = n.next;
			}
			n.data = data;
		}
	}
	public void deleteAt(Integer index) {
		if(head == null) {
			System.out.println("Error! Linked list is empty! Please enter some elements then try to delete them.");
			return;
		}
		if(index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index-1; i++){
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}
	
	public void show() {
		Node node = head;
		
		if(node == null) {
			System.out.println("Error! No elements to display as Linked List is empty! Please enter some elements then try to display them.");
			return;
		}
		
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
