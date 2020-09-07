
public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0){System.out.println("Invalid Value");}
        int a=reverse(number);
        int i=getDigitCount(number);
        while(i>0){
        int b = a%10;
        if(b==0){ 
             System.out.print("Zero ");
         }
         else if(b==1){
             System.out.print("One ");
         }
         else if(b==2){
             System.out.print("Two ");
         }
         else if(b==3){
            System.out.print("Three ");
        }
        else if(b==4){
            System.out.print("Four ");
        }
        else if(b==5){
            System.out.print("Five ");
        }
        else if(b==6){
            System.out.print("Six ");
        }
        else if(b==7){
            System.out.print("Seven ");
        }
        else if(b==8){
            System.out.print("Eight ");
        }
        else if(b==9){
            System.out.print("Nine ");
        }
        a=a/10;
        i--;
        }
    }
    public static int reverse(int a){
        int numReverse=0;
        if(a<10 && a>-10){
            return a;
        }
        while(a!=0){
            numReverse=numReverse*10+a%10;
            a=a/10;
        }
        return numReverse;
    }
    public static int getDigitCount(int a){
        if(a<0){return -1;}
        int i=0;
        if(a==0){
            return 1;
        }
        while(a>0){
            i=i+1;
            a=a/10;
        }
        return i;
    }
}