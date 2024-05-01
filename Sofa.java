public class Sofa implements Furniture {

    private String type = "Sofa";
    private int size;

    public Sofa(int size) {
        this.size = size;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public double accept(FurnitureVisitor visitor) {
        return visitor.visit(this);
    }
}
