package DataStructure;

class Doubly_LinkedList{
	private Node head;
	private Node tail;
	private int size = 0;
	private class Node{
		private Object data;
		private Node next;
		public Node(Object input) { //어떤 노드가 생성됐을때 그 노드가 갖고 있는 값 
			this.data = input;
			this.next = null;
		}
		public String toString() { //편하게 값을 출력해서 보기 위한 함수 
			return String.valueOf(this.data);
		}
	}
	void addFirst(Object input) { //[addFirst]처음에 추가 
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}
	public void addLast(Object input) {//[addLast]마지막 추가 
		Node newNode = new Node(input);
		if (size==0) {
			addFirst(input);//addFirst를 사용하는 이유는 size가0일때는 tail에 대한 정보가 없기 때문 
		}else {
			tail.next=newNode;
			tail=newNode;
			size++;
		}
	}
	Node node(int index) { //특정 위치의 노드를 찾아내는 함수. 늘 첫번째부터 찾아야 함.(head)
		Node x = head;
		for (int i=0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	public void add(int k, Object input) {
		if (k==0) {
			addFirst(input);
		}else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}
	public Object removeFirst() {//삭제된 노드의 값을 리턴(규칙임)
		Node temp = head;
		head = temp.next;
		Object returnData = temp.data;
		temp = null;
		size --;
		return returnData;
	}
	public Object remove(int k) {
		if (k==0) {
			removeFirst();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size --;
		return returnData;
	}
	public int size() {
		return size;
	}
	
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}

}

public class Doubly_LinkedList_Test {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addLast(20);
		numbers.addFirst(10);
		System.out.println(numbers.indexOf(30));
	}

}
