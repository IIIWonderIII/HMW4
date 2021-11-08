import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class TriangleCheckTest {

    @Test
    @DisplayName("Positive check")
    void positiveCheck() throws Exception {
        double result = calculatePerimeter(3, 4, 5);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Positive check 2")
    void positiveCheck2() throws Exception {
        double result = calculatePerimeter(5, 6, 7);
        Assertions.assertEquals(14.696938456699069, result);
    }

    @Test
    @DisplayName("Positive check 3")
    void positiveCheck3() throws Exception {
        double result = calculatePerimeter(3, 3, 3);
        Assertions.assertEquals(2.0, result);
    }
}