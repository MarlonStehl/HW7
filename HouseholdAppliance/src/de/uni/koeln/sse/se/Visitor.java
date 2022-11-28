package de.uni.koeln.sse.se;

public interface Visitor {

    public void visitGlass(Glass glass);

    public void visitFurniture(Furniture furniture);

    public void visitElectronic(Electronic electronic);
}
