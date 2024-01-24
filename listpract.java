public class listpract {

    private Node head ;
    private Node tail ;
    private int size = 0 ;


    public void inseF(int val){
        Node node = new Node(val);
        node.next = head ;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;

    }

    public void inseL(int val){
        Node node = new Node(val);
        tail.next = node;

        tail = node ;
        if(tail == null){
            inseF(val);
            return;
        }

    }
    public void ins(int val , int ind){
        Node node = new Node(val);
        Node temp = head ;
        if(ind == 0){
            inseF(val);
        }
        for(int i = 1 ; i< ind ; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;


    }

    public int  deleF(){
        int val = head.val;
        head = head.next;
       return val;
    }
    public int deleL(){
        Node temp = head ;
        while (temp.next != tail){
            temp = temp.next;
        }
        int val = temp.val;
        tail = temp;
        tail.next = null;
        return val;
    }

    public void prin(){

        Node temp = head;

        while (temp != null ){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
























    private class Node{
        int val ;
        Node next ;

        Node(int val){
            this.val = val;
        }

        Node(int val , Node next){
            this.val = val ;
            this.next = next;

        }
        Node(){}


    }
}
