import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Fibonacci;

public class TesteFibo {

    @Test
    public void Teste1() {
        Fibonacci f = new Fibonacci();
        assertEquals(2D, f.fibo(1));
    }
    @Test
    public void Teste2() {
        Fibonacci f = new Fibonacci();
        assertEquals(8D, f.fibo(3));
    }
    @Test
    public void Teste3() {
        Fibonacci f = new Fibonacci();
        assertEquals(512D, f.fibo(9));
    }
    @Test
    public void Teste4() {
        Fibonacci f = new Fibonacci();
        assertEquals(4D, f.fibo(2));
    }
    @Test
    public void Teste5() {
        Fibonacci f = new Fibonacci();
        assertEquals(16D, f.fibo(4));
    }
}