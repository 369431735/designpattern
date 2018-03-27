package algorithm;




public class Divisor {


    public static void main(String[] args) {
        System.out.println(gcd(16,20));
    }
    public static  int gcd(int a, int b) {
        int mid=a>b?b:a;
        for(int i=mid;i>0;i--){
            if(a%i==0&&b%i==0){
                return  i;
            }
        }

        return 1;
    }
}