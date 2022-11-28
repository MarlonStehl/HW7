package de.uni.koeln.sse.se;

public class MovingCosts implements Visitor {

    public int calculateMovingCosts(HouseholdItem item) {
        item.accept(this);
        return 0;
    }

    @Override
    public void visitGlass(Glass glass) {
        double costs = 0;
        int length_cm = glass.getLenght();
        double length = ((double) length_cm) / 100;
        if (glass.getTickness() == 1) {
            // 2€ per 1 Meter of length
            costs = 2 * length;
        } else if (glass.getTickness() == 2) {
            // 1,20€ / 1 Meter length
            costs = 1.2 * length;
        } else if (glass.getTickness() == 3) {
            // 0,70€ / m length
            costs = 0.7 * length;
        } else {
            System.out.println("Bitte gültige Glassdicke angeben!");
        }
        // price
        System.out.println("Total Cost for " + glass.getName() + " is: " + costs + " Euros");

        // packing instructions
        System.out.println(" > should be wrapped with Bubble wraps and packed in a box with dimension: "
                + addOne(glass.getLenght()) + "x" + addOne(glass.getWidth()) + "x" + addOne(glass.getHeight()));
    }

    @Override
    public void visitFurniture(Furniture furniture) {
        double costs = 0;
        double weight_per_20 = ((double) furniture.getWeight()) / 20;
        costs = weight_per_20 * 5;

        // price
        System.out.println("Total Cost for " + furniture.getName() + " is: " + costs + " Euros");

        // packing instructions
        System.out.println(" > should be covered with waterproof covers with an area of the furniture: "
                + furniture.getLenght() + "x" + furniture.getWidth() + "x" + furniture.getHeight());
    }

    @Override
    public void visitElectronic(Electronic electronic) {
        double costs = 0;
        double weight_price = 0;
        if (electronic.getFragile()) {
            weight_price = ((double) electronic.getWeight()) / 10;
        } else {
            weight_price = ((double) electronic.getWeight()) / 15;
        }
        costs = 5 * weight_price;

        // price
        System.out.println("Total Cost for " + electronic.getName() + " is: " + costs + " Euros");

        // packing instructions
        System.out.println(" > should be covered with Polyethylene foam film and packed in a box with dimension: "
                + addOne(electronic.getLenght()) + "x" + addOne(electronic.getWidth()) + "x"
                + addOne(electronic.getHeight()));
    }

    private int addOne(int dimension) {
        return dimension + 1;
    }

}
