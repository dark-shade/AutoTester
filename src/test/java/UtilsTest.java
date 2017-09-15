import org.junit.jupiter.api.Test;
import util.Utils;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    private Utils ut = new Utils();

    @Test
    void getExtension() {
        assertEquals(".txt",ut.getExtension("abc.txt"));
    }

    @Test
    void setExtension() {
        assertEquals("abc.txt",ut.setExtension("abc.png",".txt"));
    }

    @Test
    void checkInts() {
        assertFalse(ut.checkInts(10,10,10));
    }

    @Test
    void removeExt() {
        assertEquals("abc",ut.removeExt("abc.txt"));
    }
}