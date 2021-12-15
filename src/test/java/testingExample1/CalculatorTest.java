package testingExample1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll //iskvieciamas pries visa klase
    static void executeBeforeAll() {
        System.out.println("@BeforeAll Metodas iskvieciamas CalculatorTest pradzioje.");
        calculator = new Calculator();
    }

    @BeforeEach //iskvieciamas pries kiekviena TEST metoda
    void executeBeforeEachTestCase() {
        System.out.println("@BeforeEach Vykdomas pries kiekviena test metoda.");
    }

    @AfterEach //iskvieciamas po kiekvieno testo
    void executeAfterEachTestCase() {
        System.out.println("@AfterEach vykdomas po kiekvieno testo.");
    }

    @AfterAll
    static void executeAfterAll() {
        System.out.println("@AfterAll CalculatorTest klases gale iskveiciamas.");
    }

    @Test
    void testAddTwoNumbers() { //testuojam calculator metoda Add
        System.out.println("Vykdomas testas Nr.1");
        //given - kas yra duota? Kokie testiniai duomenys bus naudojami.
        int firstNumber = 5;
        int secondNumber = 3;

        //when - kas ivyksta? Kokia funkcija yra isvkieciama su tais duomenimis?
        //ivyksta sudetis, jos rez. patalpinamas i kintamaji
        int sudetiesRezultatas = firstNumber + secondNumber;

        //then - tada kas? Patikrinam ar rezultatas yra toks, kurio tikimes?
        //assert - tvirtinti, assertEquals - tvirtinti, kad lygu.
        //expected - tiketinas rezultatas
        //actual - tikrasis rezultatas
        assertEquals(8, sudetiesRezultatas, "Sudeties rezultatas blogas!");
    }

    @Test
    void testCalculatorAddTwoNumbers() {
        System.out.println("Vykdomas testas Nr.2");
        //given
        int firstNumber = 124;
        int secondNumber = 276;
        //when
        int actualResult = calculator.add(firstNumber, secondNumber); //tikrasis rezultatas

        //then
        assertEquals(400, actualResult, "Skaiciai nera lygus!");
    }

    @Test
    void testAddTwoNegativeNumbers() {
        System.out.println("Vykdomas testas Nr.3");
        int firstNumber = -10;
        int secondNumber = -50;

        int actualResult = calculator.add(firstNumber, secondNumber);

        assertEquals(-60, actualResult);
    }

    @Test
    void testAddTwoNumbersWithInterest() { //tas metodas, kuris prideda palukana.
        System.out.println("Vykdomas testas Nr. 4");
        //given
        int number1 = 2;
        int number2 = 199;

        //when
        int actualResultWithInterest = calculator.addWithPalukanaOne(number1, number2);

        //then
        assertEquals(202, actualResultWithInterest);

    }

    @Test
    void testSubtractTwoNumbers() {
        System.out.println("Vykdomas testas Nr. 5");
        //given
        int firstNumber = 6;
        int secondNumber = 2;

        //when
        int actualResult = calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(4, actualResult);

    }
}