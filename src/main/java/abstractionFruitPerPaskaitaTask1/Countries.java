package abstractionFruitPerPaskaitaTask1;

public enum Countries {
    SPAIN(3000, 15, "Ispanija"),
    ITALY(2000, 21, "Italija"),
    POLAND(100, 10, "Lenkija");

    final int destinationInKm;
    final double shippingPrice;
    final String countryOfOrigin;


    Countries(int destinationInKm, double shippingPrice, String countryOfOrigin) {
        this.destinationInKm = destinationInKm;
        this.shippingPrice = shippingPrice;
        this.countryOfOrigin = countryOfOrigin;

    }

    public String getCountryInfo() {
        return "Country: " + countryOfOrigin + " Destination: " + destinationInKm + " Price: " + shippingPrice;
    }
}
