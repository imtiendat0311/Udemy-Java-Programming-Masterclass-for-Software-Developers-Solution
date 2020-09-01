public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        if(number<10){
            return number*2;
        }
        int last=number%10;
        int first=0;
        while(number>=10){
        first=number/10;
        number = number/10;    
        }
        int sum =first+last;
        return sum;
    }
}