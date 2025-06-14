package Chapter_10.Payroll_System_10;

public class Main {
    public static void main(String[] args) {
        // Create objects
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        PieceWorker pieceWorker =
                new PieceWorker("Lisa", "Brown", "555-55-5555", 20.0, 150);

        // Process each individually
        System.out.println("Employees processed individually:\n");

        System.out.printf("%s\nearned: $%,.2f\n\n",
                salariedEmployee, salariedEmployee.earnings());
        System.out.printf("%s\nearned: $%,.2f\n\n",
                hourlyEmployee, hourlyEmployee.earnings());
        System.out.printf("%s\nearned: $%,.2f\n\n",
                commissionEmployee, commissionEmployee.earnings());
        System.out.printf("%s\nearned: $%,.2f\n\n",
                basePlusCommissionEmployee, basePlusCommissionEmployee.earnings());
        System.out.printf("%s\nearned: $%,.2f\n\n",
                pieceWorker, pieceWorker.earnings());

        // Create Employee array
        Employee[] employees = new Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.println("Employees processed polymorphically:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            // Increase base salary if BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee =
                        (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
        }
    }
}
