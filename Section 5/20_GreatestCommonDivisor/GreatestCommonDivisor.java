public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a,int b){
        if(a<10 || b<10){
            return -1;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
