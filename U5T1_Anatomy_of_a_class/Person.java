package U5T1_Anatomy_of_a_class;

import javax.swing.text.StyleConstants;

public class Person {
    private String firstN;
    private String lastN;
    private int meetings;

    public Person(String firstN, String lastN) {
        this.firstN = firstN;
        this.lastN = lastN;
    }

    public String getFirstName() {
        return firstN;
    }

    public int getMeetings() {
        return meetings;
    }

    public void setMeetings(int newMeetings) {
        meetings = newMeetings;
    }

    public void meet(Person person2) {
        System.out.println("Hello my name is " + firstN);
        System.out.println("Hi, my name is " + person2.getFirstName());
        meetings++;
        person2.setMeetings(person2.getMeetings() + 1);
    }
}
