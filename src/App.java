import Entities.Bill;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Bill bill = new Bill();

    System.out.print("Sexo(F/M): ");
    bill.gender = sc.next().charAt(0);

    System.out.print("Quantidade de cevejas: ");
    bill.beer = sc.nextInt();

    System.out.print("Quantidade de refrigerantes: ");
    bill.softDrink = sc.nextInt();

    System.out.print("Quantidade de espetinhos: ");
    bill.barbecue = sc.nextInt();
  }
}
