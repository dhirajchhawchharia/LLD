import Employee.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String user, Employee employee) throws Exception {
        System.out.println("Created new row in the Employee table");
    }

    @Override
    public void delete(String user, int id) throws Exception {
        System.out.println("Deleting row in the employee table");
    }

    @Override
    public Employee get(String user, int id) throws Exception {
        System.out.println("Returning object from employee table");
        return new Employee();
    }

}
