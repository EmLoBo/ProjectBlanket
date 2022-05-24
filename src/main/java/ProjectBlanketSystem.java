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
            FirstTextilColor firstTextilColor = FirstTextilColor.valueOf(sc.nextLine());

            System.out.println("Give me second textil color: RED, BLACK, BLUE");
            SecondTextilColor secondTextilColor = SecondTextilColor.valueOf(sc.nextLine());

            System.out.println("Give me size: SMALL, MEDIUM, LARGE");
            Size size = Size.valueOf(sc.nextLine());

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
}
