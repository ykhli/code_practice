/**
 * Created by ykli1013 on 9/13/14.
 */
public class LL1 {
    public static void main(String[] args){
        String s = "FOLLOW UP";
        LinkedListNode head = new LinkedListNode(s.charAt(0));
        LinkedListNode n = head;
        for(int i =1; i<s.length(); i++){
            n.next = new LinkedListNode(s.charAt(i));
            n = n.next;
        }
        System.out.println(head.print());
       removeDup(head);
    }

    public static void removeDup(LinkedListNode node){
        while(node != null){
            LinkedListNode runner = node.next;
            while(runner != null){
                if(runner.value == node.value){
                    System.out.print(runner.value);
                    runner.delete();
                }
                runner = runner.next;
            };
            node = node.next;
        }
    }
}
