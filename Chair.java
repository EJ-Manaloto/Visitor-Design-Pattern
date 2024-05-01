public class Chair implements Furniture {

    private String type = "Chair";
    private int size;

    public Chair(int size) {
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
