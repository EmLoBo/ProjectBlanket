public class SmallBlanketCalculator implements PriceCalculator{
    public int getPrice(Blanket blanket) {
        int price;
        int featurePrice = 5;
        int featuresCount = blanket.getFeatures().size();
        if (featuresCount > 0) {
            price = (featuresCount * featurePrice) + 50;
        } else {
            price = 50;
        }
        return price;
    }
}
