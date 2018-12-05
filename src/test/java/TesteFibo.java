import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Fibonacci;

public class TesteFibo {

    @Test
    public void Teste1() {
        Fibonacci f = new Fibonacci();
        assertEquals(f.fibo(1),1L);
    }
}