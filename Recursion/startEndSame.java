package Recursion;

public class startEndSame {
   static int check(int si,int ei,String str){
    if(si>ei)
return 0;
int firstRemove=check(si+1,ei,str);
int lastRemove=check(si,ei-1,str);
int firstlastRemove=check(si+1,ei-1,str);
int ans=firstRemove+lastRemove-firstlastRemove;
if(str.charAt(si)==(str.charAt(ei)))
ans++;
return ans ;
   }
   public static void main(String[] args) {
    System.out.println(check(0,4,"abcab"));
   } 
}
