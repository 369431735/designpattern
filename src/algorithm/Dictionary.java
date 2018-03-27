package algorithm;

import javafx.scene.effect.SepiaTone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dictionary {


    public static void main(String[] args) {
        List<String >set1 =new ArrayList<>();
        set1.add("12");
        set1.add("12");
        set1.add("3");
        set1.add("21");
        set1.add("21");

        System.out.print(countRotateWords(set1));
    }
    public  static int countRotateWords(List<String> words) {
        int result=0;
      List<String> temp=new ArrayList<>();
      temp.addAll(words);
      for(String str:temp){
          if(words.contains(str)){
              while(words.contains(str)){
                  words.remove(str);
              }

          int len=str.length();
          for(int i=1;i<len;i++){
              String newStr=str.substring(i,len)+str.substring(0,i);
              while(words.contains(newStr)){
                  words.remove(newStr);
              }
          }
              result++;

          } }

     return  result;
    }
}
