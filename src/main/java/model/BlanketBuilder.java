package model;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class BlanketBuilder {
    private Size size;
    private FirstTextilColor firstTextilColor;
    private SecondTextilColor secondTextilColor;
    private List<Feature> features = new ArrayList<>();

    // metody ustawiające wartości domyślne

    public void withSize(String sizeValue) {
        if (sizeValue.isBlank()) {
            sizeValue = "MEDIUM";
        }
        this.size = Size.valueOf(sizeValue);
    }

    public void withFirstTextilColor(String firstTextilColorValue) {
        if (firstTextilColorValue.isBlank()) {
            firstTextilColorValue = "RED";
        }
        this.firstTextilColor = FirstTextilColor.valueOf(firstTextilColorValue);
    }

    public void withSecondTextilColor(String secondTextilColorValue) {
        if (secondTextilColorValue.isBlank()) {
            secondTextilColorValue = "BLACK";
        }
        this.secondTextilColor = SecondTextilColor.valueOf(secondTextilColorValue);
    }

    public void addFeatures(Feature features) {
        this.features.add(features);

    }

    public Blanket build() {
        return new Blanket(size, firstTextilColor, secondTextilColor, features);

    }
}
