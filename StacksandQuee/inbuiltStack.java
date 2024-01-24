package StacksandQuee;

import java.util.*;

public class inbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(11);
        stk.push(122);
        stk.push(13);
        stk.push(10);
        stk.push(9);
        //pop return typ is integer
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());


        Queue<Integer> que = new LinkedList<>() ;
        que.add(12);
        que.add(2);
        que.add(122);
        que.add(112);
        que.add(11);
        System.out.println(que.peek()); // peak always retuen the first itemin the quee but donot delete it
        System.out.println(que.remove()); // remove the first element and goes to the second element
        System.out.println(que.remove());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(12);
        dq.addFirst(99);
        dq.addLast(1);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);













    }
}
