public class PriceCalculator {

    public int getPriceSmallBlanket(Blanket blanket) {
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

    public int getPriceMediumBlanket(Blanket blanket) {
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

    public int getPriceLargeBlanket(Blanket blanket) {
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
