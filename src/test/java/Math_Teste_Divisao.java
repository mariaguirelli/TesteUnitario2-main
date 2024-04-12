import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Math_Teste_Divisao {
    // Testes de soma A = 1
    @Test
    public void div11() {
        Math c = new Math();
        double rOb = c.div( 1, 1);
        double rEs = 1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div12() {
        Math c = new Math();
        double rOb = c.div( 1, 2);
        double rEs = 0.5;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div1_0() {
        Math c = new Math();
        double rOb = c.div( 1, 0);
        double rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div1_1() {
        Math c = new Math();
        double rOb = c.div( 1, -1);
        double rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div1_2() {
        Math c = new Math();
        double rOb = c.div( 1, -2);
        double rEs =-0.5;
        assertEquals(rEs, rOb);
    }
    // Teste para A = 2
    @Test
    public void div21() {
        Math c = new Math();
        double rOb = c.div( 2, 1);
        double rEs = 2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div22() {
        Math c = new Math();
        double rOb = c.div( 2, 2);
        double rEs = 1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div2_0() {
        Math c = new Math();
        double rOb = c.div( 2, 0);
        double rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div2_1() {
        Math c = new Math();
        double rOb = c.div( 2, -1);
        double rEs = -2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div20() {
        Math c = new Math();
        double rOb = c.div( 2, 0);
        double rEs = 2;
        assertEquals(rEs, rOb);
    }
    // Soma A = -1
    @Test
    public void div2_2() {
        Math c = new Math();
        double rOb = c.div( 2, -2);
        double rEs = -1;
        assertEquals(rEs, rOb);
    }
    //Teste para A = -1
    @Test
    public void div_11() {
        Math c = new Math();
        double rOb = c.div( -1, 1);
        double rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div_12() {
        Math c = new Math();
        double rOb = c.div( -1, 2);
        double rEs = -0.5;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div_10() {
        Math c = new Math();
        double rOb = c.div( -1, 0);
        double rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div_1_1() {
        Math c = new Math();
        double rOb = c.div( -1, -1);
        double rEs = 1;
        assertEquals(rEs, rOb);
    }
    // Soma A = -2
    @Test
    public void div_1_2() {
        Math c = new Math();
        double rOb = c.div( -1, -2);
        double rEs = -0.5;
        assertEquals(rEs, rOb);
    }
    //Teste para A = -2
    @Test
    public void div_21() {
        Math c = new Math();
        double rOb = c.div( -2, 1);
        double rEs = -2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div_22() {
        Math c = new Math();
        double rOb = c.div( -2, 2);
        double rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div_20() {
        Math c = new Math();
        double rOb = c.div( -2, 0);
        double rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div_2_1() {
        Math c = new Math();
        double rOb = c.div( -2, -1);
        double rEs = 2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void div_2_2() {
        Math c = new Math();
        double rOb = c.div( -2, -2);
        double rEs = 1;
        assertEquals(rEs, rOb);
    }

}
