import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int cien,veinte,cinco,uno,total;
        System.out.println("Cantidad de billetes de cien:");
        cien= sc.nextInt();
        System.out.println("Cantidad de billetes de veinte:");
        veinte= sc.nextInt();
        System.out.println("Cantidad de monedas de cinco:");
        cinco= sc.nextInt();
        System.out.println("Cantidad de monedas deuno:");
        uno= sc.nextInt();
        total=(cien * 100) + (veinte * 20) + (cinco * 5) + (uno * 1);
        System.out.println("Total="+total+ "€ ");

    }
}

