import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker testGuy;
    @BeforeEach
    void setUp() {
        testGuy = new SalaryWorker("000001","Test","Guy","Sir",1984, 15, 41600);
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
        assertEquals("Person{ID='000001', firstName='Test', lastName='Guy', title='Sir', YOB=1984}Worker{hourlyPayRate=15.0}SalaryWorker{annualSalary=41600.0}",testGuy.toString());
    }

    @Test
    void setHourlyPayRate() {
        testGuy.setHourlyPayRate(11);
        assertEquals(11,testGuy.getHourlyPayRate());
    }

    @Test
    void setAnnualSalary() {
        testGuy.setAnnualSalary(31200);
        assertEquals(31200,testGuy.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(800,testGuy.calculateWeeklyPay(0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Weekly pay is a fraction of yearly salary. Total: $800.0",testGuy.displayWeeklyPay(0));
    }
}