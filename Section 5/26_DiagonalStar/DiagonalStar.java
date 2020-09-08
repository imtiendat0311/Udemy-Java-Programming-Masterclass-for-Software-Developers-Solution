public class DiagonalStar {
    public static void printSquareStar(int a){
        if(a<5){
            System.out.println("Invalid Value");
        }
        else{
        for(int i=1;i<=a;i++){
        for(int m=1;m<=a;m++){
            if(m==1||i==1 || m==i || m==a-i+1 ||m==a ||i==a){
                System.out.print("*");
            }
            else{System.out.print(" ");}

        }
        System.out.println();
        }
      }
    }

}
