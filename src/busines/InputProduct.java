package busines;

public class InputProduct {
    private int id_product;
    private int input_quantity_product;
    private int current_quantity;



    public InputProduct(int id_product, int input_quantity_product, int current_quantity){
        this.id_product = id_product;
        this.input_quantity_product = input_quantity_product;
        this.current_quantity = current_quantity;
    }

    public int getCurrent_quantity() {
        return current_quantity;
    }
    public void setCurrent_quantity(int current_quantity) {
        this.current_quantity = current_quantity;
    }

    public int getId_product(){
        return id_product;
    }
    public void setId_product(int id_product){
        this.id_product = id_product;
    }

    public int getInput_quantity_product(){
        return input_quantity_product;
    }
    public void setInput_quantity_product(int input_quantity_product){
        this.input_quantity_product = input_quantity_product;
    }

}
