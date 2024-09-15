public interface EmployeeDao {
    public void create(String user, Employee employee) throws Exception;
    public void delete(String user, int id) throws Exception;
    public Employee get(String user, int id) throws Exception;
}
