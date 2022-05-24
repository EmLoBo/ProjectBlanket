public class MediumBlanketCalculator implements PriceCalculator{
    public int getPrice(Blanket blanket) {
        int price;
        int featurePrice = 5;
        int featuresCount = blanket.getFeatures().size();
        if (featuresCount > 0) {
            price = (featuresCount * featurePrice) + 70;
        } else {
            price = 70;
        }
        return price;
    }
}
