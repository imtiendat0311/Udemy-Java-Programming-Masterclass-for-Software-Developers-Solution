public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year%4==0){
              if(year%100==0){
                if(year%400==0){
                    return true;
                }//end if year%400==0
                else //else of year%400==0
                {
                    return false;
                }//end else of year%400==0   
              }//end if year%100==0
              else //else of year%100==0
              {
                  return true;
              }//end else of year%100==0
            }//end of if year%4==0
            else //else of year%4==0
            { 
                 return false;
            }//end else of year%4==0 
        }//end first if 
        return false;
    }//end method
}//end class