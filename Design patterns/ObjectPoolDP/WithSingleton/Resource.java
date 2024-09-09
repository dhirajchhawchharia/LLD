package WithSingleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Resource {
    Connection mysqlConnection;

    public Resource() {
        try {
            mysqlConnection = DriverManager.getConnection("abc.xyz.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
