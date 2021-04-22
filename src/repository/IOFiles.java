package repository;

import utility.KeyboardHelper;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IOFiles {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        loadGame(list);
        saveGame(list);
        list.forEach(System.out::println);
    }
    public static void loadGame(List<String>list){
        try {
            List<Path> filesInFolder = Files.walk(Paths.get("C:\\Users\\11601094\\IdeaProjects\\dungeonanddragons\\FirstGame.csv"))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());
            System.out.println("Read file");

            for (Path f : filesInFolder
            ) {

                if (getFileExtension(String.valueOf(f)).equals("csv")) {
                    Thread thread = new Thread(() -> list.addAll(readfile(Path.of(String.valueOf(f)))));
                    thread.start();
                    thread.join();
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void saveGame(List<String> list){
        System.out.println("Save to file");
        System.out.println("Enter file name: ");
        String filename = KeyboardHelper.askForText(">");

        try (Writer file = new FileWriter(filename+".csv")) {

            for (String s : list
            ) {
                 writefile(file, s + "\n");

            }
        } catch (IOException  e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readfile(Path path) {

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            List<String> list = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writefile(Writer file, String s) {
        try {
            file.write(s);
        } catch (IOException ex) {
            System.out.println("Ooops,	something	went	wrong");
            System.out.println(ex.getMessage());
        }
    }

    public static String getFileExtension(String fileName) {
        if (fileName == null) {
            throw new IllegalArgumentException("fileName must not be null!");
        }

        String extension = "";

        int index = fileName.lastIndexOf('.');
        if (index > 0) {
            extension = fileName.substring(index + 1);

        }

        return extension;
    }
}
