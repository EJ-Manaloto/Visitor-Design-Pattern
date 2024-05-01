import java.util.List; 

public class DistanceBasedVisitor implements FurnitureVisitor {

    private double baseCost = 10; 
    private double costPerMile = 0.5; 
    private int distance;
    private List<Furniture> furnitureList;

    public DistanceBasedVisitor(int distance, List<Furniture> furnitureList) {
        this.distance = distance;
        this.furnitureList = furnitureList;
    }

    @Override
    public double visit(Chair chair) {
        return baseCost;  
    }

    @Override
    public double visit(Table table) {
        return baseCost + (table.getSize() * 0.2) + (distance * costPerMile); 

    @Override
    public double visit(Sofa sofa) {
        return baseCost + (sofa.getSize() * 0.5) + (distance * costPerMile); 
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Furniture furniture : furnitureList) {
            totalCost += furniture.accept(this);
        }
        return totalCost;
    }
}
