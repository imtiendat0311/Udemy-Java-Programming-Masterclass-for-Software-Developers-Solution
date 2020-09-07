public class SharedDigit {
    public static boolean hasSharedDigit(int a,int b){
    if(a<10 || a>99 || b<10 || b>99){
        return false;
    }
    else{
    int firstA=a/10;
    int endA=a%10;
    int firstB=b/10;
    int endB=b%10;
    if(firstA==firstB || firstA==endB || endA==firstB || endA==endB){
    return true;
    }
    else{
        return false;
    }    
    }
    
    }
}
