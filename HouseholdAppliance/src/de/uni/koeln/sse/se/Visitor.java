package de.uni.koeln.sse.se;

public interface Visitor {
    public void visit(Electronic electronic);

    public void visit(Furniture furniture);

    public void visit(Glass glass);

    public void visitGlass(Glass glass);

    public void visitFurniture(Furniture furniture);

    public void visitElectronic(Electronic electronic);
}
