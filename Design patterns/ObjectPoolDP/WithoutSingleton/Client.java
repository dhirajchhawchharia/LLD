package WithoutSingleton;

// import LLD.Design.ResourcePoolManager;
// import LLD.Design.Resource;

public class Client {
    public static void main(String[] args) {
        ResourcePoolManager resourcePoolManager = new ResourcePoolManager();
        
        Resource dbConnection1 = resourcePoolManager.getConnection();
        Resource dbConnection2 = resourcePoolManager.getConnection();
        Resource dbConnection3 = resourcePoolManager.getConnection();
        Resource dbConnection4 = resourcePoolManager.getConnection();
        Resource dbConnection5 = resourcePoolManager.getConnection();
        Resource dbConnection6 = resourcePoolManager.getConnection();
        Resource dbConnection7 = resourcePoolManager.getConnection();
        
        resourcePoolManager.releaseConnection(dbConnection5);
    }    
}
