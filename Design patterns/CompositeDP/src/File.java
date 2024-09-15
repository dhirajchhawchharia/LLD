public class File implements FileSystem {
    String fileName;

    public File(String file) {
        fileName = file;
    }

    @Override
    public void ls() {
        System.out.println("Filename: " + fileName);
    }

}
