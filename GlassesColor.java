import java.util.Scanner;

public class GlassesColor {
    public static void main(String[] args) {
        System.out.println("What color of glasses do you want？");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        System.out.println("The color of glasses you want is:" + color);
    }
}


