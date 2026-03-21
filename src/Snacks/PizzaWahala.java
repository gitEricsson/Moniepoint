package Snacks;

public class PizzaWahala {

    public int calculateBoxes(int numberOfPeople, String pizzaType) {
        int slicesPerBox = getSlicesPerBox(pizzaType);
        int boxes = numberOfPeople / slicesPerBox;
        if (numberOfPeople % slicesPerBox != 0) boxes++;
        return boxes;
    }

    public int calculateLeftovers(int numberOfPeople, String pizzaType) {
        int boxes = calculateBoxes(numberOfPeople, pizzaType);
        return (boxes * getSlicesPerBox(pizzaType)) - numberOfPeople;
    }

    public int calculatePrice(int numberOfPeople, String pizzaType) {
        return calculateBoxes(numberOfPeople, pizzaType) * getPricePerBox(pizzaType);
    }

    public int getSlicesPerBox(String pizzaType) {
        return switch (pizzaType) {
            case "Sapa size" -> 4;
            case "Small Money" -> 6;
            case "Big boys" -> 8;
            case "Odogwu" -> 12;
            default -> 1;
        };
    }

    public int getPricePerBox(String pizzaType) {
        return switch (pizzaType) {
            case "Sapa size" -> 2500;
            case "Small Money" -> 2900;
            case "Big boys" -> 4000;
            case "Odogwu" -> 5200;
            default -> 0;
        };
    }
}