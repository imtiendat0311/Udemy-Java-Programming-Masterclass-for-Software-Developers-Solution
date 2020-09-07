

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        
        int bigBag = bigCount*5;
        int leftOver = goal%5;
        int total = bigBag+smallCount;
        if(total == goal){return true;}
        else if(total>goal){if(smallCount<leftOver){return false;}
        return true;
        }
        else{return false;}
    }
}
