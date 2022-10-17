import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, taksimetre=10, km=2.20,ödenecek ;
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Gidilen mesafe : ");
        mesafe=scanner.nextDouble();
        ödenecek=mesafe*km+taksimetre;
        if(ödenecek<20){
            System.out.println(" Ödenecek Tutar : "+ 20);
        } else {
            System.out.println(" Ödenecek Tutar : " + ödenecek);
        }

    }
}