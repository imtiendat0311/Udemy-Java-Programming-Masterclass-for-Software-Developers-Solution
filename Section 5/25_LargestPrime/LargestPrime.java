public class LargestPrime {
  public static int getLargestPrime(int a){
    int i;
    if(a<=1){return -1;}
   for (i =2; i<a; i++){
       if(a%i==0){
           a = a/i;
           i--;
       }
   }
  return i; 
  }
}
