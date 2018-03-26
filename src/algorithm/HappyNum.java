package algorithm;

import java.util.HashSet;
import java.util.Set;

public class HappyNum {
    private Set<Integer> record=new HashSet<Integer>();

    public static void main(String[] args) {
        System.out.println(new HappyNum().isHappy(23));
    }
    public boolean isHappy(int n) {
            if(record.contains(n)){return  false;}
        record.add(n) ;
            String temp=String.valueOf(n);
            int len=temp.length();
            int result=0;
            for(int i=1;i<=len;i++){
                   int one=Integer.valueOf(temp.substring(i-1,i)) ;
                result+=one*one;
            }
            if(result==1){return true;}
            else{return isHappy(result);}
    }
}
