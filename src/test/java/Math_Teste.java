import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Math_Teste {
    // Testes de soma A = 1
    @Test
    public void soma11() {
        Math c = new Math();
        int rOb = c.soma( 1, 1);
        int rEs = 2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma12() {
        Math c = new Math();
        int rOb = c.soma( 1, 2);
        int rEs = 3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma1_1() {
        Math c = new Math();
        int rOb = c.soma( 1, -1);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma1_2() {
        Math c = new Math();
        int rOb = c.soma( 1, -2);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma10() {
        Math c = new Math();
        int rOb = c.soma( 1, 0);
        int rEs = 1;
        assertEquals(rEs, rOb);
    }
    // Teste para A = 2
    @Test
    public void soma21() {
        Math c = new Math();
        int rOb = c.soma( 2, 1);
        int rEs = 3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma22() {
        Math c = new Math();
        int rOb = c.soma( 2, 2);
        int rEs = 4;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma2_1() {
        Math c = new Math();
        int rOb = c.soma( 2, -1);
        int rEs = 1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma2_2() {
        Math c = new Math();
        int rOb = c.soma( 2, -2);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma20() {
        Math c = new Math();
        int rOb = c.soma( 2, 0);
        int rEs = 2;
        assertEquals(rEs, rOb);
    }
    // Soma A = -1
    @Test
    public void soma_11() {
        Math c = new Math();
        int rOb = c.soma( -1, 1);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_12() {
        Math c = new Math();
        int rOb = c.soma( -1, 2);
        int rEs = 1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_1_1() {
        Math c = new Math();
        int rOb = c.soma( -1, -1);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_1_2() {
        Math c = new Math();
        int rOb = c.soma( -1, -2);
        int rEs = -3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_10() {
        Math c = new Math();
        int rOb = c.soma( -1, 0);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    // Soma A = -2
    @Test
    public void soma_21() {
        Math c = new Math();
        int rOb = c.soma( -2, 1);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_22() {
        Math c = new Math();
        int rOb = c.soma( -2, 2);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_2_1() {
        Math c = new Math();
        int rOb = c.soma( -2, -1);
        int rEs = -3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_2_2() {
        Math c = new Math();
        int rOb = c.soma( -2, -2);
        int rEs = -4;
        assertEquals(rEs, rOb);
    }
    @Test
    public void soma_20() {
        Math c = new Math();
        int rOb = c.soma( -2, 0);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }

}
