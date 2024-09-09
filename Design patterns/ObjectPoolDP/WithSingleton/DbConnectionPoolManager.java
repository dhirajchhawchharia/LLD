package WithSingleton;

import java.util.*;

public class DbConnectionPoolManager {
    private List<Resource> freeResources;
    private List<Resource> usedResources;
    private Integer INITAL_POOL_SIZE = 3;
    private Integer MAX_POOL_SIZE = 6;
    private static DbConnectionPoolManager dbConnectionPoolManager;

    private DbConnectionPoolManager() {
        freeResources = new ArrayList<>();
        usedResources = new ArrayList<>();
        for(int i=0; i<INITAL_POOL_SIZE; i++) {
            freeResources.add(new Resource());
        }
    }

    public static DbConnectionPoolManager getInstance() {
        if(dbConnectionPoolManager == null) {
            synchronized (DbConnectionPoolManager.class) {
                if(dbConnectionPoolManager == null) {
                    dbConnectionPoolManager = new DbConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    public synchronized Resource getConnectionResource() {
        if(freeResources.size() == 0 && usedResources.size() < MAX_POOL_SIZE) {
            freeResources.add(new Resource());
        }
        else if(freeResources.size() == 0 && usedResources.size() >= MAX_POOL_SIZE) {
            System.out.println("No unused resources found");
            return null;
        }
        Resource currResource = freeResources.remove(freeResources.size()-1);
        usedResources.add(currResource);
        return currResource;
    }

    public synchronized void removeUnusedConnection(Resource resource) {
        for(int i=0; i<usedResources.size(); i++) {
            if(resource == usedResources.get(i)) {
                freeResources.add(resource);
                usedResources.remove(i);
                return;
            }
        }
        System.out.println("Resource not found hence not removing");
    }
}