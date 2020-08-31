public class PlayingCat {
    public static boolean isCatPlaying(boolean summer,int temp){
    if((temp>=25 && temp<=35)||(summer==true && temp>=25 && temp<=45 )){
        return true;
    }
    else{
        return false;
    }
    }
}