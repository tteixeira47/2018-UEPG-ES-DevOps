import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Fibonacci;

public class TesteFibo {

    @Test
    public void Teste1() {
        Fibonacci f = new Fibonacci();
        assertEquals(f.fibo(1),1L);
    }
    public void Teste2() {
        Fibonacci f = new Fibonacci();
        assertEquals(f.fibo(1),2L);
    }
    public void Teste3() {
        Fibonacci f = new Fibonacci();
        assertEquals(f.fibo(9),34L);
    }
    public void Teste4() {
        Fibonacci f = new Fibonacci();
        assertEquals(f.fibo(13),233L);
    }
    public void Teste5() {
        Fibonacci f = new Fibonacci();
        assertEquals(f.fibo(29),514229L);
    }
}