package ro.fastrackit.homework10;

public class CustomerPurchase {
    int id;
    String purchasedProduct;
    String name;
    String category;

    public CustomerPurchase(int id,String purchasedProduct,String name,String category) {
        this.id = id;
        this.purchasedProduct = purchasedProduct;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getPurchasedProduct() {
        return purchasedProduct;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return  '\n' + "CustomerPurchase{" +
                "id=" + id +
                ", purchasedProduct='" + purchasedProduct + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
