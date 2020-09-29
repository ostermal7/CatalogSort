import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TeapotCatalog {
    public static void main(String[] args) {
        TreeSet<Teapot> catalog = new TreeSet<>();
        System.out.println("----RATING----");
        ratingCompare(catalog);
        System.out.println("----PRICE----");
        priceCompare(catalog);
        System.out.println("----DISCOUNT----");
        discountCompare(catalog);
        System.out.println("----NAME----");
        nameCompare(catalog);
    }

    public static void ratingCompare(TreeSet<Teapot> teapots){
        teapots=new TreeSet<>((o1, o2) -> Integer.compare(o1.getRating(),o2.getRating()));
       /* teapots = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                return Integer.compare(o1.getDiscountPrice(), o2.getDiscountPrice());
            }
        });

            вот этот метод конвертировало в Integer.compare:
                if (o2.getDiscountPrice() < o1.getDiscountPrice()) {
                    return 1;
                }
                if (o2.getDiscountPrice() > o1.getDiscountPrice()) {
                    return -1;
                } else
                    return 0;
            } А дальше я упростил Integer.compare до лямбда выражения
            */

        teapots.add(new Teapot("Bushido",20,2,17));
        teapots.add(new Teapot("Tefal",15,4,14));
        teapots.add(new Teapot("Redmond",18,5,9));
        teapots.add(new Teapot("Bork",22,1,20));
        teapots.add(new Teapot("Xiaomi",15,2,14));
        for (Teapot s:teapots) {
            System.out.println(s);
        }
    }
    public static void priceCompare(TreeSet<Teapot> teapots){
        teapots=new TreeSet<>((o1, o2) -> Integer.compare(o1.getPrice(),o2.getPrice()));
        teapots.add(new Teapot("Bushido",20,2,17));
        teapots.add(new Teapot("Tefal",15,4,14));
        teapots.add(new Teapot("Redmond",18,5,9));
        teapots.add(new Teapot("Bork",22,1,20));
        teapots.add(new Teapot("Xiaomi",15,2,14));
        for (Teapot s:teapots) {
            System.out.println(s);
        }
    }
    public static void discountCompare(TreeSet<Teapot> teapots){
        teapots=new TreeSet<>((o1, o2) -> Integer.compare(o1.getDiscountPrice(),o2.getDiscountPrice()));
        teapots.add(new Teapot("Bushido",20,2,17));
        teapots.add(new Teapot("Tefal",15,4,14));
        teapots.add(new Teapot("Redmond",18,5,9));
        teapots.add(new Teapot("Bork",22,1,20));
        teapots.add(new Teapot("Xiaomi",15,2,14));
        for (Teapot s:teapots) {
            System.out.println(s);
        }
    }
    public static void nameCompare(TreeSet<Teapot> teapots){
        teapots=new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
        teapots.add(new Teapot("Bushido",20,2,17));
        teapots.add(new Teapot("Tefal",15,4,14));
        teapots.add(new Teapot("Redmond",18,5,9));
        teapots.add(new Teapot("Bork",22,1,20));
        teapots.add(new Teapot("Xiaomi",15,2,14));
        for (Teapot s:teapots) {
            System.out.println(s);
        }
    }

}
