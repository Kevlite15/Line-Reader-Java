

/**
 * A Node is one link in a linked list.  
 * Each node is a data and arrow pair.
 * The data part of the pair stores the information this Node should remember.
 * The arrow (called "next") stores a pointer to the following Node in the list, or null if there are no subsequent nodes.
 * @author Paul Olsen
 *
 * @param <T>
 */
public class Node<T> {

 T data;           //the information stored.
 Node<T> next;     //the next node or null.
 
 /**
  * Creates a new node that will store the information thing represents.
  * @param thing the information to store in this node.
  */
 public Node(T thing) {
  data = thing;
 }
 
 /**
  * Returns the information stored in this node.
  * @return the information stored in this node.
  */
 public T getData()  {  return data;  }
 
 /**
  * Returns the next node or null if there is no next node.
  * @return the next node.
  */
 public Node<T> getNext()  {  return next;  }
 
 /**
  * Replaces the information currently stored at this node with something different
  * @param thing the replacement information.
  */
 public void setData(T thing) {
  data = thing;
 }
 
 /**
  * Gets rid of the old arrow and replaces it with an arrow to the new node.
  * @param someNode the new node that comes after this node.
  */
 public void setNext(Node<T> someNode) {
  next = someNode;
 }
}