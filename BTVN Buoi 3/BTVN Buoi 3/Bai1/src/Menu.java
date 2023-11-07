import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vegetable> list = new ArrayList<>();
        while (true) {
            System.out.print("\n-------------------------------------\n");
            System.out.println("1. Enter a new vegetable into list");
            System.out.println("2. Display all the list");
            System.out.println("3. Sort by revenue");
            System.out.println("4. Group by unit");
            System.out.println("5. Search a vegetable");
            System.out.print("6. EXIT");
            System.out.print("\n-------------------------------------\n");
            System.out.print("Enter your choice: ");
            Integer choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1: {
                    sc.nextLine();
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter unit: ");
                    String unit = sc.nextLine();
                    System.out.print("Enter quantity sold: ");
                    int quantitySold = sc.nextInt();
                    System.out.print("Enter sale: ");
                    int sale = sc.nextInt();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    Vegetable vegetable = new Vegetable(id, name, unit, quantitySold, sale, price);
                    list.add(vegetable);

                    break;
                }
                case 2: {
                    System.out.printf("%-4s %-15s %-7s %-15s %-7s %-10s %-10s\n", "ID", "Name", "Unit", "Quantity sold", "Sale", "Price", "Revenue");
                    for (Vegetable vegetable : list) {
                        vegetable.display();
                    }
                    break;
                }
                case 3: {
                    Collections.sort(list, new SortByRevenue());
                    break;
                }
                case 4: {
                    Collections.sort(list, new SortByUnit());
                    break;
                }
                case 5: {
                    sc.nextLine();
                    System.out.print("Enter the keyword: ");
                    String word = sc.nextLine();
                    for (Vegetable vegetable : list) {
                        if (vegetable.getName().contains(word)) {
                            vegetable.display();
                        }
                    }
                    break;
                }
                case 6: {
                    sc.close();
                    return;
                }

                default:
                    break;
            }
        }
    }
}