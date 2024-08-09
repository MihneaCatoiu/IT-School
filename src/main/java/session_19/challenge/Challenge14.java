package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Products {
    String name;
    String category;
    double price;

    public Products(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
    public class Challenge14 {

        public static void main(String[] args) {
            List<Products> products = Arrays.asList(
                    new Products("PC", "electronics", 5000),
                    new Products("Boat", "vehicles", 7000),
                    new Products("Pizza", "food", 100)
            );

            Optional<Map.Entry<String, Double>> highestAveragePrice = products.stream()
                    .collect(Collectors.groupingBy(
                            Products::getCategory,
                            Collectors.summingDouble(Products::getPrice)
                    ))
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue());

            if (highestAveragePrice.isPresent()) {
                Map.Entry<String, Double> entry = highestAveragePrice.get();
                System.out.println("Category with the highest average price: " + entry.getKey());
                System.out.println("Average price: " + entry.getValue());
            } else {
                System.out.println("No departments found.");
            }
        }
    }

