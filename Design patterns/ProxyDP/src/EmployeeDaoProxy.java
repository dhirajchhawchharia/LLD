public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDaoObj;

    public EmployeeDaoProxy() {
        employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String user, Employee employee) throws Exception {
        if(user.equals("ADMIN")) {
            employeeDaoObj.create(user, employee);
        }
        else throw new Exception("Access denied");
    }

    @Override
    public void delete(String user, int id) throws Exception {
        if(user.equals("ADMIN")) {
            employeeDaoObj.delete(user, id);
            return;
        }
        throw new Exception("Access denied!!");
    }

    @Override
    public Employee get(String user, int id) throws Exception {
        if(user.equals("ADMIN") || user.equals("USER")) {
            return employeeDaoObj.get(user, id);
        }
        throw new Exception("Access denied!");
    }


}
