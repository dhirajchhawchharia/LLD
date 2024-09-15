package Employee;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();

        Employee employeeDetails = employeeFacade.getDetailsByEmail("Abc");
    }
}
