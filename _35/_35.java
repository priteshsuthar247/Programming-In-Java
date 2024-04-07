import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class _35 {
    public static void main(String[] args) {
        File directory = new File("D:\\Pritesh\\College\\4th Semester\\Programming In Java\\Practicals");
        File[] files = directory.listFiles();

        for (File file : files) {
            System.out.println("File: " + file.getName());
            try {
                Path filePath = Paths.get(file.getAbsolutePath());
                BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
                System.out.println("Creation time: " + attrs.creationTime());
                System.out.println("Last modified time: " + attrs.lastModifiedTime());
                System.out.println("Size: " + attrs.size() + " bytes");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("-------------------");
        }
    }
}
