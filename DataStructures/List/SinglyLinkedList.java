package DataStructures.List;

/*
 * List - LinkedList
 * ------
 *  1. Two or more items linked with each other using Node are called Linked List
 *  2. SinglyLinkedList
 *  - Node will have single data and pointer
 *  - First node points as head node
 */

public class SinglyLinkedList {

    private Node head;
    private int size;

    public SinglyLinkedList() {
	head = null;
	size = 0;
    }

    public SinglyLinkedList(Node head, int size) {
	this.head = head;
	this.size = size;
    }

    // returns size is empty or not
    public boolean isEmpty() {
	return size == 0;
    }

    // returns the size of the list
    public int size() {
	return size;
    }

    // inserts data into the list
    public void insert(int value) {
	insertWithDP(value, size);
    }

    // assigns data and pointer to the node
    public void insertWithDP(int value, int position) {
	checkIndex(position, 0, size);
	Node newNode = new Node(value);
	if (head == null) {
	    head = newNode;
	    size++;
	    return;
	} else if (position == 0) {
	    newNode.next = head;
	    head = newNode;
	    size++;
	    return;
	}
	Node cur = head;
	for (int i = 0; i < position - 1; ++i) {
	    cur = cur.next;
	}
	newNode.next = cur.next;
	cur.next = newNode;
	size++;
    }

    // check the index is in the bounds
    private void checkIndex(int position, int start, int end) {
	if (position < start || position > end) {
	    throw new IndexOutOfBoundsException(position + " ");
	}

    }

    // clear all nodes in the list
    public void clear() {
	Node cur = head;
	while (cur != null) {
	    Node prev = cur;
	    cur = cur.next;
	    prev = null;
	}
	head = null;
	size = 0;
    }

    // returns the head position memory location
    public int getHead() {
	return getWP(0);
    }

    // return the node at specific position
    private int getWP(int position) {
	checkIndex(position, 0, size - 1);
	Node cur = head;
	for (int i = 0; i < position; i++) {
	    cur = cur.next;
	}
	return cur.value;
    }

    // deletes the head of the node
    public void deleteHead() {
	deleteWP(0);
    }

    // delete the tail of the node
    public void delete() {
	deleteWP(size - 1);
    }

    // delete the node at a specific position
    private void deleteWP(int position) {
	checkIndex(position, 0, size - 1);
	if (position == 0) {
	    Node destroy = head;
	    head = head.next;
	    destroy = null;
	    size--;
	    return;
	}
	Node cur = head;
	for (int i = 0; i < position - 1; ++i) {
	    cur = cur.next;
	}
	Node destroy = cur.next;
	cur.next = cur.next.next;
	destroy = null;
	size--;
    }

    // returns the total number of nodes in the list
    public int count() {
	int count = 0;
	Node cur = head;
	while (cur != null) {
	    cur = cur.next;
	    count++;
	}
	return count;
    }

    // search a specific value at the list
    private boolean search(int key) {
	Node cur = head;
	while (cur != null) {
	    if (cur.value == key) {
		return true;
	    }
	    cur = cur.next;
	}
	return false;
    }

    @Override
    public String toString() {
	String result = "[ ";
	Node cur = head;
	while (cur != null) {
	    result += cur.value + " ";
	    cur = cur.next;
	}
	return result + "]";
    }

    public static void main(String[] args) {
	SinglyLinkedList list = new SinglyLinkedList();

	System.out.println(list.toString());
	System.out.println("Size -> " + list.size());
	System.out.println("IsEmpty -> " + list.isEmpty());
	list.insert(3);
	list.insert(5);
	list.insert(6);
	System.out.println(list.toString());
	System.out.println("Size -> " + list.size());
	System.out.println("IsEmpty -> " + list.isEmpty());
	list.clear();
	System.out.println(list.toString());
	list.insert(3);
	list.insert(5);
	list.insert(6);
	System.out.println(list.toString());
	list.insertWithDP(10, 3);
	System.out.println(list.toString());
	System.out.println("Total nodes : " + list.count());
	System.out.println("Head : " + list.getHead());
	list.deleteHead();
	System.out.println(list.toString());
	list.delete();
	System.out.println(list.toString());
	list.insert(15);
	list.insert(17);
	System.out.println(list.toString());

	list.deleteWP(2);
	System.out.println(list.toString());
	System.out.println(list.toString());
	System.out.println("Head Node : " + list.getHead());
	System.out.println("Value at Node 1 -> " + list.getWP(1));
	System.out.println(list.toString());
	System.out.println(list.search(17));
	System.out.println(list.toString().equals("[ 5 6 17 ]"));
    }

}

class Node {

    // Value of the node
    int value;
    // Points to the next node
    Node next;

    // empty Constructor
    Node() {
    }

    // Constructor assigns value to the data
    Node(int value) {
	this(value, null);
    }

    // Constructor assigns value to the data and points to next Node
    Node(int value, Node next) {
	this.value = value;
	this.next = next;
    }

}
