import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker testGuy;
    @BeforeEach
    void setUp() {
        testGuy = new Worker("000001","Test","Guy","Sir",1984, 15);
    }

    @org.junit.jupiter.api.Test
    void setID() {
        testGuy.setID("000002");
        assertEquals("000002",testGuy.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        testGuy.setFirstName("Hank");
        assertEquals("Hank",testGuy.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        testGuy.setLastName("Hernandez");
        assertEquals("Hernandez",testGuy.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        testGuy.setTitle("Dr.");
        assertEquals("Dr.",testGuy.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        testGuy.setYOB(1987);
        assertEquals(1987,testGuy.getYOB());
    }

    @org.junit.jupiter.api.Test
    void fullName() {
        assertEquals("Test Guy",testGuy.fullName());
    }

    @org.junit.jupiter.api.Test
    void formalName() {
        assertEquals("Sir Test Guy",testGuy.formalName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals("39",testGuy.getAge());
    }

    @org.junit.jupiter.api.Test
    void testGetAge() {
        assertEquals("5",testGuy.getAge(1989));
    }

    @org.junit.jupiter.api.Test
    void toCSVDataRecord() {
        assertEquals("000001,Test,Guy,Sir,1984",testGuy.toCSVDataRecord());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Person{ID='000001', firstName='Test', lastName='Guy', title='Sir', YOB=1984}Worker{hourlyPayRate=15.0}",testGuy.toString());
    }

    @Test
    void setHourlyPayRate() {
        testGuy.setHourlyPayRate(11);
        assertEquals(11,testGuy.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(300,testGuy.calculateWeeklyPay(20));
        assertEquals(1056.75,testGuy.calculateWeeklyPay(60.3));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Regular pay hours: 20.0 Total: $300.0 Overtime hours: 0.0 Total: $0.0 Combined pay: $300.0",testGuy.displayWeeklyPay(20));
        assertEquals("Regular pay hours: 40.0 Total: $600.0 Overtime hours: 20.299999999999997 Total: $456.74999999999994 Combined pay: $1056.75",testGuy.displayWeeklyPay(60.3));
    }
}