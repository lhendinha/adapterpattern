import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {
    private ISocketAdapter sockAdapter;

    @BeforeEach
    void setUp() {
        sockAdapter = new SocketAdapter();
    }

    @Test
    void testGet12Volts() {
        System.out.println("Running: testGet12Volts");

        Volt voltage12 = sockAdapter.get12Volt();
        assertEquals(voltage12.getVolts(), 12.000021818221487);
    }

    @Test
    void testGet127Volts() {
        System.out.println("Running: testGet127Volts");

        Volt voltage127 = sockAdapter.get127Volt();
        assertEquals(voltage127.getVolts(), 127.00611938575223);
    }

    @Test
    void testGet220Volts() {
        System.out.println("Running: testGet220Volts");

        Volt voltage220 = sockAdapter.get220Volt();
        assertEquals(voltage220.getVolts(), 220.0);
    }
}
