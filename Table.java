public class Table implements Furniture {

    private String type = "Table";
    private int size;

    public Table(int size) {
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
