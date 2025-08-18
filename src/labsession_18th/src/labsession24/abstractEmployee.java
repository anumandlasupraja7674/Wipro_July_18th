package labsession24;

abstract class Employee {
    String name;
    int id;

    abstract double calculateSalary();
}

class PermanentEmployee extends Employee {
    double monthlySal;

    PermanentEmployee(double monthlySal) {
        this.monthlySal = monthlySal;
    }

    double calculateSalary() {
        return monthlySal;
    }
}

class ContractEmployee extends Employee {
    int hourlyRate;
    int hoursWorked;

    ContractEmployee(int hourlyRate, int hoursWorked) {
    
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class abstractEmployee {
    public static void main(String[] args) {
        Employee emp1 = new PermanentEmployee(50000);
        Employee emp2 = new ContractEmployee(500, 4);

        System.out.println(emp1.calculateSalary());
        System.out.println(emp2.calculateSalary());
    }
}
