public class NumberPalindrome {
 public static boolean isPalindrome(int number){
    int reverse = 0;
    int numberBefore=number;
    while(number != 0){
        int lastDigit=number%10;
        reverse=reverse*10+lastDigit;
        number=number/10;
    }
    System.out.println(reverse);
    if(reverse==numberBefore){
        return true;
    }
    else{return false;}
 }
}
