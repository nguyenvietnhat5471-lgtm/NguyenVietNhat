import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       List<Product> products = new ArrayList<>();

        products.add(new Laptop("LT01", "MacBook 211", 45000000, "Apple"));
        products.add(new Laptop("LT02", "Dell 123", 32000000, "Dell"));
        products.add(new Smartphone("SP01", "iPhone 18", 28000000, 187.0));
        products.add(new Smartphone("SP02", "Galaxy S24", 22000000, 167.0));
        products.add(new Tablet("TB01", "iPad Air", 15000000, 10.91));

        System.out.println("=== DANH SACH SAN PHAM CUA HANG ===");
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }
    }

