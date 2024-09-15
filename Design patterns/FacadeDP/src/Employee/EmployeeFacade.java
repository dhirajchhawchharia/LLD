package Employee;

public class EmployeeFacade {
    EmployeeDao employeeDao;

    public EmployeeDao() {
        employeeDao = new EmployeeDao();
    }

    public void insert() {
        employeeDao.insert();
    }

    public Employee getDetailsByEmail(String email) {
        return employeeDao.getDetailsByEmail(email);
    }
}
