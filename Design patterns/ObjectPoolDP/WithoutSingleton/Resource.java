package WithoutSingleton;

import java.sql.Connection;
import java.sql.DriverManager;


public class Resource {
    Connection myConnection;

    public Resource() {
        try {
            myConnection = DriverManager.getConnection("abc.xyz.com");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
