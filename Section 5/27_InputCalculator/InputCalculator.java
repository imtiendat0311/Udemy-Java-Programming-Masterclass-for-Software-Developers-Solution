import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage (){
        Scanner obj = new Scanner(System.in);
        int sum =0;
        int count =0;
        while(true) {
            boolean hasNextInt = obj.hasNextInt();
            if(hasNextInt) {
                int number = obj.nextInt();
                count++; // how many integers the user has entered
                sum += number;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
                obj.close();
                break;
            }
        }
    }
}
