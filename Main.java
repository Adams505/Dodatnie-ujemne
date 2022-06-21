import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj liczbe do sprawdzenia");
int x = scan.nextInt();
    if (x>0)
      System.out.println("Liczba "+x+" jest dodatnia");
    if (x<0)
      System.out.println("Liczba "+x+" jest ujemna");
    if (x==0)
      System.out.println("Liczba wynosi 0");
  }
}