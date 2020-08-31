public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int result1 = (int)(a*1000);
        int result2 = (int)(b*1000);
 
        if(result1==result2){
            return true;}
        else{    
        return false;}
    }
}