public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a)==false || isValid(b)==false || isValid(c)==false){
            return false;
        }
        int lastDigitA=a%10;
        int lastDigitB=b%10;
        int lastDigitC=c%10;
        if(lastDigitA==lastDigitB || lastDigitA==lastDigitC || lastDigitC==lastDigitB){
            return true;
        }
        return false;
    }
    public static boolean isValid(int a){
        if(a<10 || a>1000){
            return false;
        }
        return true;
    }
}