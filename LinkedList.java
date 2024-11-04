public class LinkedList {
 
   private class Node {
      private Object data;
      private Node next;
   }
   // TO-DO: declare any required data members
   // ...
   private Node head = new Node();
   private Node tail = new Node();
   private Node nextNode = new Node();
   private int size = 0; 
   public LinkedList() {
      // TO-DO: initialize all data members to
      // make this an empty LinkedList object.
      // ...
     //size = 0;
	  head.next = tail;
	  System.out.println("Inside LinkedList = head.next = " + head.next);
	  
   }
   public void add(Object obj) {
      // TO-DO: add "obj" to the end of the LinkedList.
      // ...
	  System.out.println("Inside ADD = Object obj: " + obj); 
	  Node newNode = new Node();
      newNode.data = obj;
	  System.out.println("Inside ADD = newNode.data: " + newNode.data);
      newNode.next = tail;
	  System.out.println("Inside ADD = newNode.next: " + newNode.next);
      Node prevNode = head;
      while (prevNode.next != tail) {
         prevNode = prevNode.next;
		 System.out.println("Inside ADD = prevNode: " + prevNode);
      }
      prevNode.next = newNode;
	  System.out.println("Inside ADD = prevNode.next " + prevNode.next);
      size++;
	  System.out.println("Inside ADD = size: " + size);
   }
   public void first() {
      // TO-DO: set an internal "next" pointer to the head Node of
      // the list.
      // ...
      nextNode = head.next;
	  System.out.println("Inside First = nextNode " + nextNode);
	  System.out.println("Inside First = nextNode.data " + nextNode.data);
   }
   public Object next() {
      // TO-DO: return the data item pointed at by the internal "next" pointer, and then
      // advance the pointer.
      // ...
      Object data = nextNode.data;
      nextNode = nextNode.next;
	  System.out.println("Inside next nextNode = " + nextNode.next);
	  System.out.println("Inside next data = " + data);
      return data;
   }
   public Object getAt(int index) {
      // TO-DO: find the Node at the requested index (zero-based)
      // and return the data contained within that Node.
      // ...
      //if (index < 0 || index >= size) {
      //   throw new IndexOutOfBoundsException();
      //}
	  System.out.println("Inside getAt index = " + index);
      if (index < 0 || index >= size) {
         return null;
      }
      else{
         Node currNode = head.next;
         for (int i = 0; i < index; i++) {
            currNode = currNode.next;
         }
         return currNode.data;
      }
   }
   
   public static void main(String[] args) {
      // Do not modify the main for submission.
      // You may, of course, modify the main for your own testing purposes.
      System.out.println("1.create the linked list");
	  LinkedList list = new LinkedList();
	  System.out.println("2. First add bread"); 
      list.add("bread");
      System.out.println("3. Second add salad");
	  list.add("salad");
	  System.out.println("4. Third add potatoes");
      list.add("potatoes");
	  
	  //System.out.println("In the main list.next = " + list.next());
      list.first();
	  System.out.println("In the main getAt(0) = " + list.getAt(0));
	  //list.getAt(1);
	  //list.getAt(2);
	  
      System.out.println(list.next());
      System.out.println(list.next());
      System.out.println(list.next());
   }
}

