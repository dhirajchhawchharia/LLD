public class Client {
    public static void main(String[] args) {
        FileSystem file1 = new File("Border");

        Directory directory = new Directory("Comedy movies");
        
        FileSystem comedyMovie1 = new File("Fukrey");
        FileSystem comedyMovie2 = new File("Dhamaal");
        FileSystem netflixDirectory = new Directory("Netflix Comedy");

        directory.addFileSystem(comedyMovie1);
        directory.addFileSystem(comedyMovie2);
        directory.addFileSystem(netflixDirectory);

        Directory directoryFinal = new Directory("structure");
        directoryFinal.addFileSystem(directory);
        directoryFinal.addFileSystem(file1);

        directoryFinal.ls();
    }
}
