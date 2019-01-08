import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonacciTest {

    @Test public void
    fibonacci_1_1(){
        assertThat(1, is(1));
    }

}