package Recursion;

public class removeDuplicates {
  static void remove(String s,int i, StringBuilder str, boolean check[]){
    if(i==s.length()){
        System.out.println(str);
        return;
    }
    char ch=s.charAt(i);
    if(check[ch-'a']==true)
        remove(s,i+1,str,check);
    else{
        check[ch - 'a'] = true;
    remove(s,i+1,str.append(ch),check);
  }
}
    public static void main(String[] args) {
        String strold="appnnaacolleegge";
        boolean[] check=new boolean[26];
        StringBuilder strnew=new StringBuilder();
        remove(strold,0,strnew,check);
    }
}
