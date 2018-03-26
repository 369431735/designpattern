package algorithm;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr={1,4,7,8,9,8,3,0,9,6};
        sort(arr,0,arr.length-1);
       for(int i=0;i<arr.length;i++) {
           System.out.println(arr[i]);
       }

    }
    private  static void sort(int[] arr,int start,int end){
        if(start>=end){return;}
        int l=start;
        int j=end;
        int standard=arr[end];
        int size=end-start;
        int point=end; //当前位置
        for(int i=0;i<size;i++){
            //从左边比较
            if(end>start){
                //交换位置
                if(arr[start]>standard){
                arr[point]=arr[start];
                arr[start]=standard;
                end=start;
                start=point-1;
                    point=end;
                }
                else{start++;}

            }
            //从右边比较
            else{
                //交换位置
                if(arr[start]<standard){
                    arr[point]=arr[start];
                    arr[start]=standard;
                    end=start;
                    start=point+1;
                    point=end;
                }
                else{
                    start--;
                }
            }
        }
        if(end>l){
            sort(arr,0,end-1);

        }
        if(end<j){
            sort(arr,end,arr.length-1);
        }

    }
}
