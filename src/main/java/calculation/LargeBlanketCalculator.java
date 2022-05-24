package calculation;

import model.Blanket;

public class LargeBlanketCalculator implements CalculatorStrategy{
    public int getPrice(Blanket blanket) {
        int price;
        int featurePrice = 5;
        int featuresCount = blanket.getFeatures().size();
        if (featuresCount > 0) {
            price = (featuresCount * featurePrice) + 90;
        } else {
            price = 90;
        }
        return price;
    }
}
