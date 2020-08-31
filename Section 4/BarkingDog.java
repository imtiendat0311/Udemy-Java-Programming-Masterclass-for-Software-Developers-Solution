public class BarkingDog {
   public static boolean shouldWakeUp(boolean dog, int hourOfDay){
    if((hourOfDay<8 || hourOfDay>22)&&(0<=hourOfDay && hourOfDay<=24)&&dog==true ){
    return true;}
    return false;
   }
   public static void main (String args[]){
       System.out.println(shouldWakeUp (true, 1));
       System.out.println(shouldWakeUp (false, 2));
       System.out.println(shouldWakeUp (true, 8));
       System.out.println(shouldWakeUp (true, -1));
   }
}