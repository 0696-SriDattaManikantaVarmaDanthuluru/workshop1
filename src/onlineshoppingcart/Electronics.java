package onlineshoppingcart;

class Electronics extends Product {
    private String warranty;

    public Electronics(String name, double price, String warranty) {
        super(name, price);
        this.warranty = warranty;

    }

    public String getWarranty() {
        return warranty;
    }

}
