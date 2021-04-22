package repository;

import utility.KeyboardHelper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOFiles {
    public static void main(String[] args) {

        List<Path> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.addAll(loadGame());
     //   saveGame(list1);
        list.forEach(System.out::println);
        Path path;
    }
    public static List<Path> loadGame(){
        try {
            List<Path> filesInFolder = Files.walk(Paths.get("C:\\Users\\11601094\\IdeaProjects\\dungeonanddragons\\SavedGames"))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());
            System.out.println("Read file");

//            for (Path f : filesInFolder
//            ) {
//
//                if (getFileExtension(String.valueOf(f)).equals("csv")) {
//                    Thread thread = new Thread(() -> list.addAll(readfile(Path.of(String.valueOf(f)))));
//                    thread.start();
//                    thread.join();
//                }
//            }
            return filesInFolder;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
    public static void saveGame(List<String> list){
        System.out.println("Save to file");
        System.out.println("Enter file name: ");
        String dir = "C:\\Users\\11601094\\IdeaProjects\\dungeonanddragons\\SavedGames";
        String filename = KeyboardHelper.askForText(">");

        try (Writer file = new FileWriter(dir+ filename+".csv")) {

            for (String s : list
            ) {
                Thread thread = new Thread(()-> writefile(file, s + "\n"));
                thread.start();
                thread.join();
            }
        } catch (IOException | InterruptedException e) {
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

    public static void deleteFiles() {
        try {
            Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\11601094\\IdeaProjects\\dungeonanddragons\\SavedGames"));
            {
                walk.map(Path::toFile)
                        .peek(System.out::println)
                        .forEach(File::delete);
                System.out.println(walk.count()+ "deleted");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
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
