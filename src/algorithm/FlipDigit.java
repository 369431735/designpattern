package algorithm;

import java.util.ArrayList;
import java.util.List;

public class FlipDigit {

    public static void main(String[] args) {
        int[] num={1,0,1,1,1,0,0,1,1,1,0,1};
        System.out.println( flipDigit(num));
    }

    public static int flipDigit(int[] nums) {
       int len=nums.length;
        List<Integer> need=new ArrayList<>();
        List<Integer> sum1=new ArrayList<Integer>();
        List<Integer> sum0=new ArrayList<Integer>();
        Integer sum1temp=0;
        Integer sum0temp=0;
       int preNum=nums[0];
        int temp=1;

        for(int i=1;i<len;i++){
          if(nums[i]==preNum){
              temp++;
          }
          else{
              need.add(temp);
              preNum=nums[i];
              temp=new Integer(1);
          }
        }
        //判断最后是否为0
        if(nums[len-1]!=0){
            need.add(temp);
        }
        //移除最前面的1；

        if(nums[0]==1){
            need.remove(0);
        }

            for(int i=need.size()-1;i>=0;i--){
                if(i%2==0){
                    sum0temp+=need.get(i);
                    sum0.add(sum0temp);
                }else{
                    sum1temp+=need.get(i);
                    sum1.add(sum1temp);
                }
            }
        int result=0;

        int len1=sum1.size();
        //0全转换为1
        if(len1>0){
         result=sum0.get(len1-1);
        int total0=sum0.get(len1-1);
        for(int i=0;i<len1;i++){
            int total=sum1.get(i)+total0-sum0.get(i);
            result=result>total?total:result;
        }
        }

        return result;
    }
}
