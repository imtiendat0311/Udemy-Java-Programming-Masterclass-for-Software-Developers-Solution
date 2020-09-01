public class SumOddRange {
    public static boolean isOdd (int a){
        if(a<0){return false;}
        else if(a%2==0){return false;}
        return true;
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        if(start<0 || end<0 || start>end){return -1;}
        else if(isOdd(start)==false){
            for(int i=start+1;i<=end;i=i+2){
                sum=sum+i;
            }
            return sum;
        }
        else{
        for(int i=start;i<=end;i=i+2){
            sum=sum+i;
        }
        return sum;}
    }
}