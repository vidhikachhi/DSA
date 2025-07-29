package Recursion;

public class pairingFriends {
    static int friends(int n){
     if(n==1||n==2)return n;
     int singleways=friends(n-1);
     int paired=friends(n-2);
     int pairedways=paired*(n-1);//n-1 because pairing gives n-1 ways to be paired suppose ther are 3 people a,b,c and needs to be paired 
     //they can be as a,b and c single or a,c and b single therefore n=3 so n-1 ways to pair a with remaining ones 
     return singleways+pairedways;
      }
    public static void main(String args[]){
    System.out.println(friends(3));
    }
}
