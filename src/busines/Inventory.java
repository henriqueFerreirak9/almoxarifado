package busines;

public class Inventory {
    private int id_product;
    private int current_quantity;


    public Inventory(int id_product, int current_quantity){
        this.id_product = id_product;
        this.current_quantity = current_quantity;
    }

    public int getId_product() {
        return id_product;
    }
    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getCurrent_quantity() {
        return current_quantity;
    }
    public void setCurrent_quantity(int current_quantity) {
        this.current_quantity = current_quantity;
    }
}
