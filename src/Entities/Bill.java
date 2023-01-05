package Entities;

public class Bill {

  public char gender;
  public  int beer;
  public  int barbecue;
  public  int softDrink;

  public double cover() {
    if (feeding() > 30) {
      return 0;
    } else {
      return 4;
    }
  }

  public double feeding() {
   
    int beer = 5 * this.beer;
    int softDrink = 3 * this.softDrink;
    int barbecue = 7 * this.barbecue;
    return beer+softDrink+barbecue;
  }

  public double ticket(char gender) {
    if (gender == 'F') {
      return 8.00;
    } else {
      return 10.00;
    }
  }
  public double total() {
    return feeding() + ticket(gender) + cover();
  }

@Override
public String toString() {
    return String.format("Consumo = R$ %.2f%nCouvert = R$ %.2f%nIngresso = R$ %.2f%nValor a pagar = R$ %.2f%n",feeding(),cover(),ticket(gender),total());
}
  
}
