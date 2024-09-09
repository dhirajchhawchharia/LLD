package WithSingleton;

public class Client {
    public static void main(String[] args) {
        DbConnectionPoolManager dbConnectionPoolManager = DbConnectionPoolManager.getInstance();

        Resource dbConnection1 = dbConnectionPoolManager.getConnectionResource();
        Resource dbConnection2 = dbConnectionPoolManager.getConnectionResource();
        Resource dbConnection3 = dbConnectionPoolManager.getConnectionResource();
        Resource dbConnection4 = dbConnectionPoolManager.getConnectionResource();
        Resource dbConnection5 = dbConnectionPoolManager.getConnectionResource();
        Resource dbConnection6 = dbConnectionPoolManager.getConnectionResource();
        Resource dbConnection7 = dbConnectionPoolManager.getConnectionResource();

        dbConnectionPoolManager.removeUnusedConnection(dbConnection7);
        dbConnectionPoolManager.removeUnusedConnection(dbConnection3);
    }
}
