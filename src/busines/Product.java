package busines;

public class Product {
    private int id;
    private int barcode;
    private int und;
    private String name;



    public Product(int id, int barcode, int und){
        this.id = id;
        this.barcode = barcode;
        this.und = und;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getBarcode() {
        return barcode;
    }
    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getUnd() {
        return und;
    }
    public void setUnd(int und) {
        this.und = und;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
