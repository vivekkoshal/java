package LinkedList;

import CircularLinkedList.CLL;
import OOpsInterfaces.Media;
import jdk.jshell.spi.SPIResolutionException;

import java.rmi.NoSuchObjectException;

public class CoustemLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public CoustemLinkedList() {
        this.size = 0;
    }

    public void insetF(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insetL(int val) {
        if (tail == null) {
            insetF(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insetF(val);
            return;
        }
        if (index == size) {
            insetL(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) { // startt from 1 because it already ponints 0
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;

    }

    public int deleteF() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteL() {
        if (size <= 1) {
            return deleteF();
        }
        Node seclast = get(size - 2);
        int val = tail.value;
        tail = seclast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteF();
        }
        if (index == size - 1) {
            return deleteL();
        }

        Node prior = get(index - 1);
        int val = prior.next.value;
        prior.next = prior.next.next;
        return val;

    }

    //insert using recursion
    public void insertRec(int val, int indi) {
        //head value and index is given to us
        //1.have void return type and make changes in linklist
        //2. have node return type that return the list node to make changes
        head = insertRec(val, indi, head);

    }

    private Node insertRec(int val, int indi, Node node) {
        if (indi == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, indi - 1, node.next);
        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    //Questions
    public void dupliremove() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    //Question 2
    //merg two sorted link lists ans give in agorted order
    public static CoustemLinkedList mergtwo(CoustemLinkedList L1, CoustemLinkedList L2) {
        Node f = L1.head;
        Node s = L2.head;

        CoustemLinkedList ans = new CoustemLinkedList();

        while (f != null && s != null) {
            if (f.value <= s.value) {
                ans.insetL(f.value);
                f = f.next;
            } else {
                ans.insetL(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insetL(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insetL(s.value);
            s = s.next;
        }

        return ans;

    }


    //code borwed from circular linked list to check the program is runing or not
    public void insertcri(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //Question 3
    //is there any cycle prest in linked list
    public static boolean cyclechek(CoustemLinkedList ll) {
        Node fas = ll.head;
        Node slo = ll.head;


        while (fas != null && fas.next != null) {
            fas = fas.next.next;
            slo = slo.next;
            if (fas == slo) {
                return true;
            }

        }

        return false;


    }

    public static int elemincycle(CoustemLinkedList ll) {
        Node fas = ll.head;
        Node slo = ll.head;


        while (fas != null && fas.next != null) {
            fas = fas.next.next;
            slo = slo.next;
            if (fas == slo) {
                int size = 1;
                slo = slo.next;

                while (slo != fas) {
                    size++;
                    slo = slo.next;
                }
                return size;
            }

        }

        return 0;


    }


    public static Node detectcycle(CoustemLinkedList ll) {
        //find the length of cycle
        int length = elemincycle(ll);

        //find the start node ;
        Node f = ll.head;
        Node s = ll.head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        //now keep moving both them forward untiill they meet cycle start
        while (s != f) {
            s = s.next;
            f = f.next;
        }

        return s; // can also return f

    }


//    //Happy no. question
//    public static boolean ishappy(int n){
//        int slow = n ;
//        int fast = n ;
//         while(fast != slow){
//             slow = findsrr(slow);
//             fast = findsrr(findsrr(fast));
//         }
//
//         if(slow == 1){
//             return true;
//         }
//         return false;
//
//
//
//    }
//
//    public static int findsrr(int num){
//        int ans = 0;
//        while(num>0){
//            int rem = num%10;
//            ans = ans + rem*rem;
//            num = num/10;
//        }
//        return ans ;
//    }

    //Question
    // middel oof a link using fast and slow pointers
    public  Node Middle() {
        Node s = head;
        Node f =head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


    public static void MergSort(CoustemLinkedList ll) {
        if (ll.head == null || ll.head.next == null) {
        //    return ll.head;
        }

      //  Node mid = Middle(ll);
      //  Node left = MergSort(ll);
      //  Node right = MergSort(ll);
      //   ll.mergtwo(left, right);
       // return mergtwo(left, right);

    }

    //have to do bubble sort recursion to sort the link list  using bubble sort

    //revercing list using recursion
    private  void reverrec(Node node){
        if(node ==tail){
            head = tail;
            return;
        }

        reverrec(node.next);
        tail.next = node ;
        tail = node ;
        tail.next = null;

    }

    //in place revercel of LL using  itration

    public void reverse(){
    if(size <2){
        return;
    }
    Node prev = null;
    Node present = head ;
    Node next = present.next;

    while(present != null){
        present.next = prev;
        prev = present;
        present = next;
        if(next != null){
                    next = next.next;
        }
    }

    head = prev;

    }

    public void reversesection(int left , int right){
        if(left == right){
            return ;
        }
        //skip the first left -1 nodes
        Node current = head;
        Node privious = null;

        for (int i = 0; current!=null && i < left; i++) {
            privious = current;
            current = current.next;
        }
        Node last = privious;
        Node newend = current;

        //reverse between left and right
        Node next = current.next;
        for (int i = 0; current!= null&&i < right-left+1; i++) {
            current.next = privious;
            privious = current;
            current = next;
            if(next != null){
                next = next.next;
            }

        }

        if(last != null){
            last.next = privious;
        }
        else{
            head = privious;
        }

        newend.next = current;


    }

    //how to check palendrom in link list or note
    //reverse the second half and from the mid and head start checking forward
    public boolean isPalendrom(){
        //first find middle
        Node s = head;
        int mid = 0 ;
        Node f =head;
        while (f != null && f.next != null) {
            mid++;
            s = s.next;
            f = f.next.next;
        }
        Node headmid = s;
        if(mid%2 == 0) {

            reversesection(mid, mid * 2);
        }
        if(mid%2 != 0) {

            reversesection(mid+1, mid * 2+1);
        }



        while (head != null && headmid != null){
            if(head.value != headmid.value){
                return false;
            }
        }

        return true;




    }



}