package extendsExample2;

public class Worker {
    private String name;
    public void makeMoney(){
        System.out.println("3. Make EUR");
    }
    public void goingToWork(){
        System.out.println("1. Going to work");
    }

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void superviserWorks() {
        System.out.println("2. Superviser Works");
    }

    public void doNotMakeMoneyFromPrograming() {
        System.out.println("3. Do not make EUR from programing");
    }
}
