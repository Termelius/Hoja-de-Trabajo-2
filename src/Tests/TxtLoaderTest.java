package Tests;

import Stack.IStack;
import Stack.PostFixStack;
import Stack.DynamicStack;
import Stack.TxtLoader;

public class TxtLoaderTest {
    public static void main(String[] args) {
        TxtLoader txtLoader = new TxtLoader();

        // Realizar pruebas de carga de archivos
        String[] loadedData = txtLoader.loadFile();
        System.out.println("Data loaded from file:");
        for (String line : loadedData) {
            System.out.println(line);
        }
    }
}
