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


    @Test
    public void test_move_forward_facing_south() {
        // Given
        MarsRover rover = new MarsRover(0, 0, "S");

        // When
        rover.execute("M");

        // Then
        assertEquals("(0, -1) S", rover.report());
    }


    @Test
    public void test_move_forward_facing_west() {
        // Given
        MarsRover rover = new MarsRover(0, 0, "W");

        // When
        rover.execute("M");

        // Then
        assertEquals("(-1, 0) W", rover.report());
    }


    @Test
    public void test_move_forward_facing_East() {
        // Given
        MarsRover rover = new MarsRover(0, 0, "E");

        // When
        rover.execute("M");

        // Then
        assertEquals("(1, 0) E", rover.report());
    }

}



