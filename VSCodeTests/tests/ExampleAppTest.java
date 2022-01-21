import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExampleAppTest {
    private final ExampleApp app = new ExampleApp();
    
    @Test
    void hello() {
        assertEquals(app.hello(), "Hello!");
    }
}
