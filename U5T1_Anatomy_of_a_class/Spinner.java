package U5T1_Anatomy_of_a_class;

public class Spinner {
    private int sections;
    private int spinValue;
    private int spinCount;
    private int spinSum;
    private double averageSpin;

    public Spinner(int sections) {
        this.sections = sections;
    }

    public int spin() {
        spinCount++;
        spinValue = (int) (Math.random() * (sections)) + 1;
        spinSum += spinValue;
        return spinValue;
    }

    public int getSpinValue() {
        return spinValue;
    }
    
    public int getSpinCount() {
        return spinCount;
    }

    public int getSpinSum() {
        return spinSum;
    }

    public double averageSpin() {
        averageSpin = (double) (spinSum) / spinCount;
        averageSpin = averageSpin * 100;
        averageSpin = Math.round(averageSpin);
        averageSpin = averageSpin / 100;
        return averageSpin;
    }
}
