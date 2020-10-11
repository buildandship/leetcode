package lp.algos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDirectoriesAndFiles {

    static int count = 0;

    public static void main(String[] args) {

        // File Path
        String filePath = "/Users/praveen/";

        File directory = new File(filePath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            List<File> fileList = Arrays.stream(files).collect(Collectors.toList());
            System.out.println("File Path " + filePath);

            // Recursive call
            //printDirectoriesAndFile(files,0);
            //printDirectoriesAndFile(fileList,0);
            //System.out.println("\nTotal Calls "+count);
            // Java 8
            printFiles();
        }

    }

    //    static void printDirectoriesAndFile(File [] files, int level){
    static void printDirectoriesAndFile(List<File> files, int level) {
        count++;
        for (File f : files) {
            for (int i = 0; i < level; i++)
                System.out.print("\t");

            if (f.isFile())
                System.out.println(f.getName() + " : ");
            else if (f.isDirectory()) {
                System.out.println("\n[ " + f.getName() + " ]");

                //recursive call subdirectories
                //printDirectoriesAndFile(f.listFiles(), level+1);
                printDirectoriesAndFile(Arrays.stream(f.listFiles()).collect(Collectors.toList()), level + 1);
            }
        }

    }

    static void printFiles() {
        try (Stream<Path> paths = Files.walk(Paths.get("/Users/praveen/Dropbox"))) {
            paths
                    .filter(Files::isDirectory)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
