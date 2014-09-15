/**
 * Doubly linked list implementation
 */
public class LinkedListNode {
    LinkedListNode prev = null;
    LinkedListNode next = null;
    int numValue;
    char value;


    public LinkedListNode(char value){
        this.value = value;
    }

    void appendToTail(char value){
        LinkedListNode n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = new LinkedListNode(value);
        n.next.prev = n;
    }

    void deleteValue(char value) {
        LinkedListNode n = this;

        while(n.value == value ){
            if(n.next == null){
                System.out.print("No value "+value+" found");
            }
            n = n.next;
        }
        n.next.prev = n.prev;
        n.prev.next = n.next;
    }

    void delete(){
        LinkedListNode n = this;
        if(n.next!=null) n.next.prev = n.prev;
        if(n.prev!=null) n.prev.next = n.next;
    }

    String print(){
        LinkedListNode n = this;
        StringBuffer out = new StringBuffer();

        while(n!=null){
            out.append(n.value);
            n = n.next;
        };
        return out.toString();
    }
}
