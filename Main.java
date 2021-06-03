package FileWork;
import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder log = new StringBuilder();

    static void makeDir(String path) {
        new File(path).mkdir();
        log.append("Каталог " + path + " создан \n");
    }

    static void makeFile(String path) throws IOException {
        try {
            if (new File(path).createNewFile()) {
                log.append("Файл " + path + " создан \n");
            }
        } catch (IIOException ex) {
            log.append(ex.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {
        makeDir("C:" + File.separator + "Games" + File.separator + "src");
        makeDir("C:" + File.separator + "Games" + File.separator + "res");
        makeDir("C:" + File.separator + "Games" + File.separator + "savegames");
        makeDir("C:" + File.separator + "Games" + File.separator + "temp");
        makeDir("C:" + File.separator + "Games" + File.separator + "src" + File.separator + "main");
        makeDir("C:" + File.separator + "Games" + File.separator + "src" + File.separator + "test");
        makeDir("C:" + File.separator + "Games" + File.separator + "res" + File.separator + "drawables");
        makeDir("C:" + File.separator + "Games" + File.separator + "res" + File.separator + "vectors");
        makeDir("C:" + File.separator + "Games" + File.separator + "res" + File.separator + "icons");
        makeFile("C:" + File.separator + "Games" + File.separator + "src" + File.separator +
                "main" + File.separator + "Main.java");
        makeFile("C:" + File.separator + "Games" + File.separator + "src" + File.separator +
                "main" + File.separator + "Utils.java");
        makeFile("C:" + File.separator + "Games" + File.separator + "temp" + File.separator +
                "temp.txt");

        try (FileWriter writer = new FileWriter("C:" + File.separator + "Games" + File.separator +
                "temp" + File.separator + "temp.txt")) {
            writer.append(log);
        } catch (IOException ex) {
            log.append(ex.getMessage());
        }

    }
}
