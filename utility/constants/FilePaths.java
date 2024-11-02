package utility.constants;

public enum FilePaths {
    MAC_LOG_FILE("%h/MiniProjects/Spinning-Donut/project.log");

    private final String path;
    
    FilePaths(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
