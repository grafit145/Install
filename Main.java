package FileWork;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder log = new StringBuilder();

    static void makeDir(String path) {
        new File(path).mkdir();
        log.append("Каталог " + path + " создан\n");
    }

    static void makeFile(String path) throws IOException {
        try {
            if (new File(path).createNewFile()) {
                log.append("Файл " + path + " создан\n");
            }
        } catch (IIOException ex) {
            log.append(ex.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {
        makeDir("C://Games//src");
        makeDir("C://Games//res");
        makeDir("C://Games//savegames");
        makeDir("C://Games//temp");
        makeDir("C://Games//src//main");
        makeDir("C://Games//src//test");
        makeDir("C://Games//res//drawables");
        makeDir("C://Games//res//vectors");
        makeDir("C://Games//res//icons");
        makeFile("C://Games//src//main//Main.java");
        makeFile("C://Games//src//main//Utils.java");
        makeFile("C://Games//temp//temp.txt");

        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt")) {
            writer.append(log);
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

    }
}
