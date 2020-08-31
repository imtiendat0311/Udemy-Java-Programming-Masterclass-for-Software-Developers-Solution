public class BarkingDog {
   public static boolean shouldWakeUp(boolean dog, int hourOfDay){
    if((hourOfDay<8 || hourOfDay>22)&&(0<=hourOfDay && hourOfDay<=24)&&dog==true ){
    return true;}
    return false;
   }
}
