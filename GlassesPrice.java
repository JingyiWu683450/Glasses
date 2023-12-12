import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GlassesPrice {
    public static void main(String[] args) {
        System.out.println("You want cheap,modest or expensive glasses?");
        Scanner scanner = new Scanner(System.in);
        String price = scanner.nextLine();

        List<String> glassesList = new ArrayList<>();
        if (price.equals("cheap")) {
            glassesList.add("Firmoo");
            glassesList.add("Zenni Optical");
        } else if (price.equals("modest")) {
            glassesList.add("Ray-Ban");
            glassesList.add("Oakley");
        } else if (price.equals("expensive")) {
            glassesList.add("Gucci");
            glassesList.add("Prada");
        }

        System.out.println("Based on your input, we recommend the following glasses brands:");
        for (String glasses : glassesList) {
            System.out.println(glasses);
        }

    }
}