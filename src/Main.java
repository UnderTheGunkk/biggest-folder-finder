import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "C:/Users/д/Desktop";
        File file = new File(folderPath);

        System.out.println(getFoldrSize(file));
    }

    public static long getFoldrSize(File folder){
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for(File file : files){
            sum += getFoldrSize(file);
        }
        return sum;
    }
}
