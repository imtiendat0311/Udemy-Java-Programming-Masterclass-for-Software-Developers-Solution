public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
    if(kiloBytes<0){
        System.out.println("Invalid Value");
    }
    int megaBytes = kiloBytes/1024;
    int remainKiloBytes = kiloBytes%1024;
    System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainKiloBytes+" KB");
    }
    public static void main (String args[]){
        printMegaBytesAndKiloBytes(2500); 

        printMegaBytesAndKiloBytes(-1024); 

        printMegaBytesAndKiloBytes(5000);
    }
}