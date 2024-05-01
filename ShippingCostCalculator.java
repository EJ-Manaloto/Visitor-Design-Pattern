import java.util.ArrayList; 
import java.util.List; 

public class ShippingCostCalculator {

    public static void main(String[] args) {
        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Chair(10));
        furnitureList.add(new Table(20));

        furnitureList.add(new Sofa(50));

        DistanceBasedVisitor visitor = new DistanceBasedVisitor(100, furnitureList); // Assuming distance of 100 miles

        System.out.println("Chair Cost: $" + furnitureList.get(0).accept(visitor));
        System.out.println("Table Cost: $" + furnitureList.get(1).accept(visitor));
        System.out.println("Sofa Cost: $" + furnitureList.get(2).accept(visitor));

        System.out.println("Total Cost (initial distance): $" + visitor.calculateTotalCost() + ";");
    }
}
