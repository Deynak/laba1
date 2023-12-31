package bsu.rfe.java.group7.lab1.Deynak.varA8;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if (parts[0].equals("ChewingGum")) {
                breakfast[itemsSoFar] = new ChewingGum(parts[1]);
            }
            itemsSoFar++;
        }
        countFood(breakfast, breakfast[1]);
        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;
        System.out.println("Good luck!");
    }

    public static void countFood(Food[] foods, Food food) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food)) {
                count++;
            }
        }
        System.out.println("There are " + count + " products of type " + food.getClass().getSimpleName() + " on the breakfast");
    }

}
