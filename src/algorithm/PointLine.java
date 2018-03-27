package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PointLine {
    public static void main(String[] args) {
        Point[] arr=new Point[3];
        Point point=new Point(1,1);
        Point point1=new Point(1,1);
        Point point2=new Point(1,1);

        arr[0]=point;
        arr[1]=point1;
        arr[2]=point2;

        System.out.println(maxPoints(arr));

    }
    public static int maxPoints(Point[] points) {

        int result=0;
        if(points!=null){
            if(points.length<3){
                result=points.length;
            }else{
                Map<String,Integer> pointMap=new HashMap<>();
                List<Point> pointsArray=new ArrayList<Point>();
                for(Point point:points){
                    int value=1;
                    if(pointMap.keySet().contains(point.x+":"+point.y)){
                        value=value+ pointMap.get(point.x+":"+point.y);
                    }
                    else{
                        pointsArray.add(point);
                    }
                    pointMap.put(point.x+":"+point.y,value);
                }
                int len=pointsArray.size();
                if(len<3){
                    for(int i=0;i<len;i++){
                        result+=pointMap.get(pointsArray.get(i).x+":"+pointsArray.get(i).y);
                    }
                }else{
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int temp=pointMap.get(pointsArray.get(i).x+":"+pointsArray.get(i).y)+pointMap.get(pointsArray.get(j).x+":"+pointsArray.get(j).y);
                double slope=0D;
                if(pointsArray.get(i).x!=pointsArray.get(j).x){
                    slope=(pointsArray.get(i).y-pointsArray.get(j).y)*1D/(pointsArray.get(i).x-pointsArray.get(j).x);
                }
                for(int k=j+1;k<len;k++){
                    double slope2=0D;
                    if(pointsArray.get(i).x!=pointsArray.get(k).x){
                        slope2=(pointsArray.get(i).y-pointsArray.get(k).y)*1D/(pointsArray.get(i).x-pointsArray.get(k).x);
                    }
                    if(slope==slope2){temp+=pointMap.get(pointsArray.get(k).x+":"+pointsArray.get(k).y);}
                }
                result= result>temp?result:temp;
            }
        }}}}
        return result;
    }

   static  class Point {
     int x;
      int y;
     Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
  }
}
