public class TeenNumberChecker {
    public static boolean hasTeen (int a, int b, int c){
        if(isTeen(a)==true || isTeen(b)==true || isTeen(c)==true){
            return true;
        }
        return false;
    }
    public static boolean isTeen (int a){
        if(a>=13 && a<=19){
            return true;
        }
        return false;
    }
}