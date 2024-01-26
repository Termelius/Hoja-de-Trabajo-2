package Tests;

import org.junit.Test;
import org.junit.Assert; 
import TxtReader.TxtLoader;

public class TxtLoaderTest {
    @Test
    public void LoadingFiles() {
        TxtLoader loader = new TxtLoader();
        String[] lines = loader.loadFile();
        Assert.assertEquals(lines.length, 5);
    }

}
