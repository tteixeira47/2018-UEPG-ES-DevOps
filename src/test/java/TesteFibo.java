import org.junit.Test;
import com.example.Fibonacci;

public class TesteFibo {

    @Test
    public void Teste1() {
        Fibonacci f = new Fibonacci();
        assertEquals(f.fibo(1), 1, "O 1 numero de fibonacci deve ser 1");
    }
}