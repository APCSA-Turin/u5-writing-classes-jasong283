package U5T1_Anatomy_of_a_class;

public class Dice {
    private int sides;
    private int roll;
    private int count;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int setSides(int newSides) {
        return sides = newSides;
    }

    public int getSides() {
        return sides;
    }

    public int roll() {
        count++;
        roll = (int) (Math.random() * (sides)) + 1;
        return roll;
    }

    public int getRollCount() {
        return count;
    }

    public int getRollValue() {
        return roll;
    }
 

}

