package LinkedList;

import CircularLinkedList.CLL;

public class Main {
    public static void main(String[] args) {
        CoustemLinkedList ll = new CoustemLinkedList();
//        ll.insetF(12);
//        ll.insetF(13);
//        ll.insetF(14);
//        ll.insetF(15);
//        ll.insetL(99);
//        ll.insert(100 , 3);
//        ll.display();
//        System.out.println(ll.deleteF());
//        ll.display();
//        System.out.println(ll.deleteL());
//        ll.display();
//        System.out.println(ll.delete(1));
//        ll.display();
//        //ll.find(100);
//        ll.insertRec(12,1);
//       ll.display();

       //questions
        ll.insetF(1);
        ll.insetL(1);
        ll.insetL(1);
        ll.insetL(2);
        ll.insetL(4);
        ll.insetL(4);
        ll.display();
        ll.dupliremove();
        ll.display();

        CoustemLinkedList LL = new CoustemLinkedList();
        LL.insetL(1);
        LL.insetL(2);LL.insetL(3);LL.insetL(4);LL.insetL(99);

        CoustemLinkedList chek = new CoustemLinkedList();
        chek = CoustemLinkedList.mergtwo(ll , LL);
        chek.display();


        //made a cyclic link list to check
        CoustemLinkedList crl = new CoustemLinkedList();
        crl.insertcri(1);
        crl.insertcri(2);crl.insertcri(122);
        crl.insertcri(12);crl.insertcri(212);crl.insertcri(112);


        System.out.println(CoustemLinkedList.cyclechek(LL));
        System.out.println(CoustemLinkedList.elemincycle(crl));

        LL.display();
        LL.reverse();
        LL.display();
        LL.reversesection(2,4);
        LL.display();

        CoustemLinkedList palan = new CoustemLinkedList();
        palan.insetL(1);
        palan.insetL(2);
        palan.insetL(3);
        palan.insetL(3);
        palan.insetL(2);
        palan.insetL(1);

        System.out.println(palan.isPalendrom());


    }









}
