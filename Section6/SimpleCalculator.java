public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double a){
        this.firstNumber=a;
    }
    public void setSecondNumber(double a){
        this.secondNumber=a;
    }
    public double getAdditionResult(){
        double total = firstNumber+secondNumber;
        return total;
    }
    public double getSubtractionResult(){
        double sub = firstNumber-secondNumber;
        return sub;
    }
    public double getMultiplicationResult(){
        double multi=firstNumber*secondNumber;
        return multi;
    }
    public double getDivisionResult(){
        if(secondNumber==0){
            return 0;
        }
        else{
            double div = firstNumber/secondNumber;
            return div;
        }
    }
}
