package LinkedList.Scratch;

public class SearchInLL {

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

static Node head;
static Node tail;
static int size=0;

//add
void add(int data){
    Node newnode = new Node(data);
    newnode.next = head;
    head = newnode;
    if(tail == null) tail = newnode;
    size++;
}



//recursion search
int recSearch(int key){
return helper(key,head,0);
}

//helper for recursion
int helper(int key,Node curr,int i){
if(curr==null)return -1;
if(curr.data==key)return i;
return helper(key,curr.next,i+1);
}



//itearation search
int iteration(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key)
        return i;
        temp=temp.next;
        i++;
    }
    return -1;
}

    public static void main(String[] args) {
        SearchInLL ll=new SearchInLL();
        ll.add(50);
        ll.add(40);
        ll.add(30);
        ll.add(20);
        ll.add(10);
        System.out.print(ll.recSearch(40));
    }
}
