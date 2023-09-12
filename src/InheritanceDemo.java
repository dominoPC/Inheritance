import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {
        List<Worker> employees = new ArrayList<>();
        Worker alice = new Worker("000001","Alice","Adams","Ms.",1955,11);
        employees.add(alice);
        Worker bob = new Worker("000002","Bob","Robertson","Mr.",1966,15);
        employees.add(bob);
        Worker carol = new Worker("000003","Carol","Carlton", "Ms.",1977,20);
        employees.add(carol);
        SalaryWorker duncan = new SalaryWorker("000004","Duncan","Daniels","Mr.",1988,0,41600);
        employees.add(duncan);
        SalaryWorker eve = new SalaryWorker("000005","Eve","Everest","Ms.",1999,0,50000);
        employees.add(eve);
        SalaryWorker fred = new SalaryWorker("000006","Fred","Fredrickson","Dr.",2000,0,500000);
        employees.add(fred);

        for(int i = 0; i<3; i++){//three weeks
            int hours = 40; //default hours
            if(i==1){hours=50;} //50 for week 2
            System.out.println("Week "+(i+1)+"\n----------------------------------------------------------------------------");
            for(Worker worker:employees){
                System.out.print(worker.fullName()+" - ");
                System.out.println(worker.displayWeeklyPay(hours));
            }
            System.out.println();
        }
    }
}