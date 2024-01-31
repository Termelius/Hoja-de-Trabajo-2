package TxtReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtLoader {
    private String path;

    public TxtLoader(String filePath) {
        this.path = filePath;
    }

    public String[] loadFile() {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo " + path + ": " + e.getMessage());
        }

        return lines.toArray(new String[0]);
    }
}

