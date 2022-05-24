import calculation.*;
import model.*;

import java.util.Scanner;

public class ProjectBlanketSystem {
    public static void main(String[] args) {
        new ProjectBlanketSystem().run();
    }

    void run() {
        System.out.println("System is running");

        Blanket blanket = makeBlanket();
        CalculatorChoice calculatorChoice = new CalculatorChoice();
        calculatorChoice.choice(blanket);
    }

    private Blanket makeBlanket() {
        try (Scanner sc = new Scanner(System.in)) {
            BlanketBuilder builder = new BlanketBuilder();

            System.out.println("Give me first textil color: RED, BLACK, BLUE");
            builder.withFirstTextilColor(sc.nextLine());

            System.out.println("Give me second textil color: RED, BLACK, BLUE");
            builder.withSecondTextilColor(sc.nextLine());

            System.out.println("Give me size: SMALL, MEDIUM, LARGE");
            String sizeValue = sc.nextLine();
            builder.withSize(sizeValue);

            while (true) {
                System.out.println("Which features you choose: EMBROIDERY_NAME, NICE_PACKAGING, POST_CARD. NO finish adding features");
                builder.addFeatures(Feature.valueOf(sc.nextLine()));

                System.out.println("next feature? YES/NO");
                String nextFeature = sc.nextLine();

                if (nextFeature.equals("NO")) {
                    break;
                }
            }
            // model.Blanket blanket = new model.Blanket(size, firstTextilColor, secondTextilColor, features);
            Blanket blanket = builder.build();
            System.out.println(blanket);
            return blanket;
        }

    }


}
