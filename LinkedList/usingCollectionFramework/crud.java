package LinkedList.usingCollectionFramework;

import java.util.LinkedList;

public class crud {

    public static void main(String[] args) {
        //defining linked list
        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.add(40);
        ll.addFirst(30);
        ll.addLast(50);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(60);

        //print
        System.out.println(ll);
        //remove
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeAll(ll);
        System.out.println(ll);
        
       }
}
