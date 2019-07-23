package co.eliseev;

import org.junit.Test;


public class ApplicationTest {

    @Test
    public void test() {
        System.out.println("Hello from test");
        System.out.println("Some changes");
        throw new RuntimeException();
    }
}