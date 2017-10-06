package task2.Model.Person;

import task2.Model.AbstractPerson;

public class Worker extends AbstractPerson {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getDetails() {
        return "Name: " + this.getName() + " Age: " + this.getAge() + " year(s) " + " Job: " + this.getJob();
    }
}
