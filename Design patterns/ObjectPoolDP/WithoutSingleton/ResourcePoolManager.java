package WithoutSingleton;

import java.util.ArrayList;
import java.util.List;



public class ResourcePoolManager {
    private List<Resource> freeResources;
    private List<Resource> usedResources;
    private Integer INTIAL_POOL_SIZE = 3;
    private Integer MAX_POOL_SIZE = 6;

    public ResourcePoolManager() {
        freeResources = new ArrayList<>();
        usedResources = new ArrayList<>();
        for(int i=0; i<INTIAL_POOL_SIZE; i++) {
            freeResources.add(new Resource());
        }
    }

    public Resource getConnection() {
        if(freeResources.size() == 0 && usedResources.size() < MAX_POOL_SIZE) {
            freeResources.add(new Resource());
        }
        else if(freeResources.size() == 0 && usedResources.size() == MAX_POOL_SIZE) {
            System.out.println("No unused resources found");
            return null;
        }
        Resource currResource = freeResources.get(freeResources.size()-1);
        freeResources.remove(freeResources.size()-1);
        usedResources.add(currResource);
        return currResource;
    }

    public void releaseConnection(Resource resource) {
        for(int i=0; i<usedResources.size(); i++) {
            if(resource == usedResources.get(i)) {
                freeResources.add(resource);
                usedResources.remove(i);
                break;
            }
        }
    }
}
