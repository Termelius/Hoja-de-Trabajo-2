package Tests;

import org.junit.Test;
import org.junit.Assert;
import TxtReader.TxtLoader;

/**
 * pruebas unitarias
*/
public class TxtLoaderTest {

    /**
     * Prueba la funcionalidad
     */
    @Test
    public void LoadingFiles() {
        TxtLoader loader = new TxtLoader();

        String[] lines = loader.loadFile();

        Assert.assertEquals(3, lines.length);
    }
}

