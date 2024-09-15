import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystems = new ArrayList<>();
    }
    
    public void addFileSystem(FileSystem fs) {
        fileSystems.add(fs);
    }

    @Override
    public void ls() {
        System.out.println("Directory name: " + directoryName);
        for(FileSystem fs : fileSystems) {
            fs.ls();
        }
    }

}
