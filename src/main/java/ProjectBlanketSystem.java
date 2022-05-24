import model.Feature;
import model.FirstTextilColor;
import model.SecondTextilColor;
import model.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectBlanketSystem {
    public static void main(String[] args) {
        new ProjectBlanketSystem().run();
    }

    void run() {
        System.out.println("System is running");

        makeBlanket();
    }

    private void makeBlanket() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Give me first textil color: RED, BLACK, BLUE");
            FirstTextilColor firstTextilColor = withFirstTextilColor(sc.nextLine());

            System.out.println("Give me second textil color: RED, BLACK, BLUE");
            SecondTextilColor secondTextilColor = withSecondTextilColor(sc.nextLine());

            System.out.println("Give me size: SMALL, MEDIUM, LARGE");
            String sizeValue = sc.nextLine();
            Size size = withSize(sizeValue);

            List<Feature> features = new ArrayList<>();
            while (true) {
                System.out.println("Which features you choose: EMBROIDERY_NAME, NICE_PACKAGING, POST_CARD. NO finish adding features");
                features.add(Feature.valueOf(sc.nextLine()));

                System.out.println("next feature? YES/NO");
                String nextFeature = sc.nextLine();

                if (nextFeature.equals("NO")) {
                    break;
                }
            }
            Blanket blanket = new Blanket(size, firstTextilColor, secondTextilColor, features);
            System.out.println(blanket);
        }

    }

// metody ustawiające wartości domyślne
    private Size withSize(String sizeValue) {
        if (sizeValue.isBlank()) {
            sizeValue = "MEDIUM";
        }
        return Size.valueOf(sizeValue);
    }

    private FirstTextilColor withFirstTextilColor(String firstTextilColorValue) {
        if (firstTextilColorValue.isBlank()) {
            firstTextilColorValue = "RED";
        }
        return FirstTextilColor.valueOf(firstTextilColorValue);
    }

    private SecondTextilColor withSecondTextilColor(String secondTextilColorValue) {
        if (secondTextilColorValue.isBlank()) {
            secondTextilColorValue = "BLACK";
        }
        return SecondTextilColor.valueOf(secondTextilColorValue);
    }

}
