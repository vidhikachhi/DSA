package Queue;

public class QfromArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
    //o(1)
    public static boolean isEmpty(){
        return rear==-1;
    }
    //O(1)
    public static void add(int data) {
        if(rear==size-1){
            System.out.println("queue is full");
            return;
        }
        rear+=1;
        arr[rear]=data;
        }
        //O(n)
    public static int remove() {
     if(rear==-1){
            System.out.println("queue empty");
            return -1;
        }
        int front=arr[rear];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear-=1;
        return front;
    }   
    public static int peek() {
         if(rear==-1){
            System.out.println("queue empty");
            return -1;
        }
        return arr[0];
    } 
}
public static void main(String[] args) {
Queue q=new Queue(5);
q.add(1);
q.add(2);
q.add(3);
q.add(1);
q.add(2);
q.add(3);
while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}

}
}