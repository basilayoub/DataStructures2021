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

	public E getElement{ return element;}
	public Node<E> getNext() {return next; }
	public void setNext(Node<E> n){next = n; }
}

/* We then define the instance variables */

private Node<E> head = null; // head node of the list
private Node<E> tail = null;
private int size = 0;

// Constructor: construct initially empty list
public MyList() {}


/* Methods from ListInterface */

public boolean isEmpty(){ 

/******************************************************************/
/* To be completed
/* should return True if the List is empty 
/******************************************************************/


}
public int numElem(){
/******************************************************************/
/* To be completed
/* should return the number of elements in the list 
/******************************************************************/



} // 
public void addFirst(E e){

/******************************************************************/
/* To be completed
/* should add an element on top of the list
/******************************************************************/



} 
public void addLast(E e){
/******************************************************************/
/* To be completed
/* should add an element at the end of the list 
/******************************************************************/




} 
public E removeFirst(){
/******************************************************************/
/* To be completed
/* should remove and return first element 
/******************************************************************/



}  
public void insert(int position, E e){
/******************************************************************/
/* To be completed
/* should insert element at given position in the list 
/******************************************************************/



} 
										   
public E remove(int position, E e){
/******************************************************************/
/* To be completed
/* should remove and return element at given position 
/******************************************************************/



} 

public E checkFirst(){
/******************************************************************/
/* To be completed
/* should return (but does not remove) first element
/******************************************************************/




}  
public E checkLast(){
/******************************************************************/
/* To be completed
/* should return (but does not remove) last element
/******************************************************************/




} 
public E checkElement(int position){
/******************************************************************/
/* To be completed
/* should return (but does not remove) element at any given position
/******************************************************************/


}  




}