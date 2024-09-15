public class Client {
    public static void main(String[] args) {
        try {
            EmployeeDaoProxy employeeDao = new EmployeeDaoProxy();
            employeeDao.create("USER", new Employee());
            System.out.println("Operation successful");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
