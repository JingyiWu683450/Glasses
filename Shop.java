import java.util.Scanner;


public class Shop{
    private Scanner input=new Scanner(System.in);
    private Store Store;
    public static void main(String[] arg){
        new Shop();
    }
    public Shop(){
        addGlasses();
        processOrder();
        runMenu();

    }
    private void addGlasses() {
        System.out.println("Entering details");
        System.out.println("-----------------");
        System.out.print("Enter glasses name:");
        String name = input.nextLine();
        System.out.print("Enter glasses material:");
        String material = input.nextLine();
        System.out.print("Enter glasses price");
        int price = input.nextInt();

    }
    private int mainMenu(){
        System.out.print("""
             Shop Menu
             ---------
             1)List the Glasses
             2)Display cheapest Glasses
             0)Exit
             ==>>"""
                );
        int option= input.nextInt();
        return option;
    }
    private void runMenu() {
        int option = mainMenu();
        while (option != 0) {
            switch (option) {
                case1 -> printListGlasses();
                case2 -> printCheapest();
                default -> System.out.println("Invalid option" +
                        "entered:" + option);
            }
        }
        System.exit(0);
    }

    private void processOrder(){
    System.out.println("How many Glasses would you like to have in your store?");
    int a= input.nextInt();
    Store=new Store();
    for (int i=0;i<a;i++){
        addGlasses();
    }
    private void printListGlasses(){
        System.out.println(Store.listGlasses());
        }

    private void printCheapest(){
        System.out.println(Store.cheapest());
        }
    }
}
