import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void test_move_forward_facing_north() {
        // Given
        MarsRover rover = new MarsRover(0, 0, "N");

        // When
        rover.execute("M");

        // Then
        assertEquals("(0, 1) N", rover.report());
    }
}



