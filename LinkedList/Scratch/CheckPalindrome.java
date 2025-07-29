package LinkedList.Scratch;

//here we will learn 

//slow fast concept
//reverse half linked list

//slow-fast technique 
//we have 2 pointers in which first ont is incremented for 1 and other for two
//i.e. slow=slow+1 and fast=fast+2 
//now inside while loop where it will rum uptil fast reaches to null, the value of slow is mid of list

public class CheckPalindrome {

    // way 1. copy linked list to array or arraylist to check O(n)time and O(n)space
    // complexity
    // way 2. here is other way to do same in O(1) space complexity.
    // first calculate mid of list.
    // then reverse half of the list.
    // then check if they are same or not.

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // add
    void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // find middle
    
    Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// this is mid of list
    }



boolean checkPalin(){
    if(head==null||head.next==null)
    return true;
    //step 1 find mid
    Node midNode=findMid(head);


    //step 2 reverse second half
Node prev=null;
Node curr=midNode;
Node next;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}

Node right=prev;//right half next
Node left =head;


//step 3 check left half and right half 
while(right!=null){
    if(left.data!=right.data)
    return false;
    left=left.next;
    right=right.next;
}
return true;
}




    void print(){
    if(head == null){
        System.out.println("Empty");
        return;  // add return to avoid continuing
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");  // shows end of list
}


    public static void main(String[] args) {
        CheckPalindrome ll = new CheckPalindrome();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        ll.add(1);
ll.print();
System.out.print(ll.checkPalin());
    }
}
