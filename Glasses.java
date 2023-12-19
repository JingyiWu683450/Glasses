public class Glasses {
    String name;
    String material;
    int price;

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name != null) {
            if (name.length() > 20)
                this.name = name.substring(0, 30);
            else
                this.name = name;
        }


    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Glasses Glasses = new Glasses();
    public String recommend() {
        String recommendBrand="";
        if (price > 0) {
            if (price < 200) {
                recommendBrand = "Firmoo";
            } else if (price < 400) {
                recommendBrand = ("Ray-Ban");

            } else if (price > 400) {
                recommendBrand = ("Gucci");

            }
        }
        return recommendBrand;

    } }
