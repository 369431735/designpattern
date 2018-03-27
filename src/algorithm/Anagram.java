package algorithm;

/**
 * 给出一个字符串数组S，找到其中所有的乱序字符串(Anagram)。如果一个字符串是乱序字符串，那么他存在一个字母集合相同，但顺序不同的字符串也在S中。
 */

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] arr={"tea","","eat","","tea",""};
        anagrams(arr);
    }
    public static List<String> anagrams(String[] strs) {
        List<String> result=new ArrayList<>();
        Set<String> hasadd=new HashSet<String>();
         Map<String,String>tmpMap =new HashMap<String,String>();
        for(String str:strs){
            List<String> tmp_=new ArrayList<>();
            for(int i=0;i<str.length();i++){
                tmp_.add(str.substring(i,i+1));
            }
            Collections.sort(tmp_, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.hashCode()-o2.hashCode();
                }
            });
            String temp="";
            for(int j=0;j<tmp_.size();j++){
                temp=temp+tmp_.get(j);
            }
            if(tmpMap.keySet().contains(temp)){
                if(!hasadd.contains(tmpMap.get(temp))){
                    result.add(tmpMap.get(temp));
                    hasadd.add(tmpMap.get(temp));
                }
                result.add(str);
            }

            else{
                tmpMap.put(temp,str);
            }
        }
        return  result;
    }
}
