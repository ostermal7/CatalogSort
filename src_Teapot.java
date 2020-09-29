import java.util.Objects;

public class Teapot implements Comparable<Teapot>{
    private String name;
    private int price;
    private int rating;
    private int discountPrice;
    @Override
    public String toString() {
        return "Teapot{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", discountPrice=" + discountPrice +
                '}';
    }

    public Teapot(){

    }

    public Teapot(String name, int price, int rating, int discountPrice) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discountPrice = discountPrice;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teapot teapot = (Teapot) o;
        return price == teapot.price &&
                discountPrice == teapot.discountPrice &&
                rating == teapot.rating &&
                name.equals(teapot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, discountPrice, name, rating);
    }

    @Override
    public int compareTo(Teapot o) {
        if (this.price!=o.price){
            return this.price-o.price;
        }if (this.discountPrice!=o.discountPrice){
            return this.discountPrice-o.discountPrice;
        }if (this.rating!=o.rating){
            return this.rating-o.rating;
        }
        return this.name.compareTo(o.name);
    }

}
