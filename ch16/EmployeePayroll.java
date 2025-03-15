public class EmployeePayroll {
    public static void main(String[] args) {
        SalariedEmployee nila = new SalariedEmployee("Nila", "MVP");
        nila.setPayRate(75000.00); // $75,000/year
        HourlyEmployee joe = new HourlyEmployee("Joe", "Security Guard", 35);
        joe.setPayRate(20.0); // $20/hr
        System.out.println(nila.calculatePaycheck());
        System.out.println(nila);
    }
}

abstract class Employee {
    protected String name;
    protected String title;
    protected double payRate;

    // include a constructor for subclasses to call
    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public abstract double calculatePaycheck();

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String toString() {
        return String.format("%s, %s", name, title);
    }
}

class HourlyEmployee extends Employee {
    private double weeklyHours;

    public HourlyEmployee(String name, String title, double hours) {
        super(name, title);
        this.weeklyHours = hours;
    }

    public double calculatePaycheck() {
        // calculate a bi-weekly paycheck based on hourly payrate multiplied by hours worked
        return payRate * weeklyHours * 2;
    }
}

class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, String title) {
        super(name, title);
    }

    public double calculatePaycheck() {
        // calculate a bi-weekly paycheck based on yearly payrate
        return payRate / 24; // 12 months per year * 2 biweekly events per month
    }

    @Override
    public String toString() {
        return String.format("%s: %s", title, name);
    }
}