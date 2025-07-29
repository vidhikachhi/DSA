package LinkedList.Scratch;
//impllemented using scratch 
//can be implemented using collection framework but it might be difficult to learn 

public class mergeSortLL {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Add node at the beginning
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print linked list
    void print() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge sort driver
    Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    // Find middle of list
    Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; // Return actual head
    }

    // Main method to test
    public static void main(String[] args) {
        mergeSortLL ll = new mergeSortLL();
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(7);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(6);

        System.out.println("Original List:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
    }
}

