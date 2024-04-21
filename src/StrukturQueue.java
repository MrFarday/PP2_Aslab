
public class StrukturQueue {
    private Node FRONT = null;
    private Node REAR = null;
    
    public boolean isEmpty() {
        return FRONT == null;
    }
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }
    
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    public void displayElements() {
        Node curNode = FRONT;
        System.out.print("Elemen dalam queue: ");
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
    
}
