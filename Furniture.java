public interface Furniture {

    String getType();

    int getSize();

    double accept(FurnitureVisitor visitor);
}
