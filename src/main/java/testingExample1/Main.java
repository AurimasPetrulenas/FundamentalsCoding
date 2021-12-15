package testingExample1;

public class Main {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));
        System.out.println("Skaiciu 5 ir 3 suma yra 8 - " + (8 == calculator.add(5, 3)));

        System.out.println(calculator.addWithPalukanaOne(5, 3));
        int sudetiesRezultatasSuPalukana = calculator.addWithPalukanaOne(10,3);
        System.out.println("Skaiciu 10 ir 3 suma su palukana 1 yra 14 - " + (14 == sudetiesRezultatasSuPalukana));
    }
}
