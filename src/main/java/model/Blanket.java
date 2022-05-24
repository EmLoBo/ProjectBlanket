package model;

import model.Feature;
import model.FirstTextilColor;
import model.SecondTextilColor;
import model.Size;

import java.util.List;

public class Blanket {
    private final Size size;
    private final FirstTextilColor firstTextilColor;
    private final SecondTextilColor secondTextilColor;
    private final List<Feature> features;

    public Blanket(Size size, FirstTextilColor firstTextilColor, SecondTextilColor secondTextilColor, List<Feature> features) {
        this.size = size;
        this.firstTextilColor = firstTextilColor;
        this.secondTextilColor = secondTextilColor;
        this.features = List.copyOf(features);
    }

    public Size getSize() {
        return size;
    }

    public FirstTextilColor getFirstTextilColor() {
        return firstTextilColor;
    }

    public SecondTextilColor getSecondTextilColor() {
        return secondTextilColor;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "model.Blanket{" +
                "size=" + size +
                ", firstTextilColor=" + firstTextilColor +
                ", secondTextilColor=" + secondTextilColor +
                ", features=" + features +
                '}';
    }
}
