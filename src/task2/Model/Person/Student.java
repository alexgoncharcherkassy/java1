package task2.Model.Person;

import task2.Model.AbstractPerson;

public class Student extends AbstractPerson {
    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String getDetails() {
        return "Name: " + this.getName() + " Age: " + this.getAge() + " year(s) " + " University: " + this.getUniversity();
    }
}
