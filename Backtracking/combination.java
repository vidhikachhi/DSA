package Backtracking;

public class combination {
        static void findCombination(String str,String ans){
          //base case
          if(str.length()==0){
          System.out.println(ans);
          return;
        }
        for(int i=0;i<str.length();i++){
            String str2=str.substring(0,i)+str.substring(i+1,str.length());
          findCombination(str2,ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        findCombination("abc  ","");
    }
}


