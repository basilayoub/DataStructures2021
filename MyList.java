public class MyList<E> implements ListInterface<E>{
	

 /*Implements a singly linked list of generic types*/


/* We first defining the inner node class */

private static class Node<E>{

	private E element;
	private Node<E> next;
	public Node(E e, Node<E> n){

		element = e;
		next = n;


	}

	public E getElement() {return element;}
	public Node<E> getNext() {return next; }
	public void setNext(Node<E> n){next = n; }
}

/* We then define the instance variables */

private Node<E> head = null; // head node of the list
private Node<E> tail = null;
private int size = 0;

// Constructor: construct initially empty list
public MyList() {

}


/* Methods from ListInterface */

public boolean isEmpty(){ 

/******************************************************************/
/* To be completed
/* should return True if the List is empty 
/******************************************************************/

	return head == null;


}
public int numElem(){
/******************************************************************/
/* To be completed
/* should return the number of elements in the list 
/******************************************************************/


	return this.size;



} // 
public void addFirst(E e){

/******************************************************************/
/* To be completed
/* should add an element on top of the list
/******************************************************************/

	Node first = new Node(e);  

	if(head == null) {  

        head = newNode;  
        this.size++;

    }  
    else {  

        Node temp = head;
        head.next = temp; 
        head = first;
        this.size++;

    }

} 
public void addLast(E e){
/******************************************************************/
/* To be completed
/* should add an element at the end of the list 
/******************************************************************/

	Node last = new Node(e);  

    if(head == null) {   

        head = last; 
        this.size++;

    }  
    else {    
     
        tail.next = last;
        last.next = null; 
        this.size++;

    }


} 
public E removeFirst(){
/******************************************************************/
/* To be completed
/* should remove and return first element 
/******************************************************************/

	if (this.size > 0) {
        Node <E> remove = head;
        head = head.getNext();
        remove.setNext(null); 
        this.size -= 1;
    }

}  
public void insert(int position, E e){
/******************************************************************/
/* To be completed
/* should insert element at given position in the list 
/******************************************************************/
	
	Node n1 = new Node(e);
    if(position == 0){
        n1.next = head;
        size++;
    }
    else{
        Node temp = head;
        for(int i = 0; i < size; i++){
            temp = temp.next;
            count++;
        }

        Node temp2 = previous.next;
        n1.next = temp2;
        temp.next = n1;
        tail.next = null;
        this.size++;
    }

} 
										   
public E remove(int position, E e){
/******************************************************************/
/* To be completed
/* should remove and return element at given position 
/******************************************************************/

	
    if(position == 0){

    	Node <E> temp = head;
    	head = null;
    	this.size -= 1;
        return temp;

    }
    else {

        Node <E> temp = head;
        for(int i = 0; i < size; i++){
            temp = temp.next;
            count++;
        }
        Node <E> temp2 = temp.next;
        temp.next = temp2.next;
        temp2.next = null;
        this.size -= 1;
        return temp2;
    }
    

} 

public E checkFirst(){
/******************************************************************/
/* To be completed
/* should return (but does not remove) first element
/******************************************************************/

	return checkElement(0);


}  
public E checkLast(){
/******************************************************************/
/* To be completed
/* should return (but does not remove) last element
/******************************************************************/

	return checkElement(size - 1);


} 
public E checkElement(int position){
/******************************************************************/
/* To be completed
/* should return (but does not remove) element at any given position
/******************************************************************/

	if(size == 0){

		return null;

	}
	else if (position > size){

		throw new Exception( "Position is larger than the linked list"); 

	}
	else{

		Node <E> temp = head;

		for(int i = 0; i < position; i++){

			temp = temp.next;

		}

		return temp.getElement()

	}

}  




}