package pro.sky.skypospringdemo;

public class Item {
    private Integer id;
    private final String nameProduct;

    public Item(Integer id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

    public Integer getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }
}
