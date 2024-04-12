import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Math_Teste_Subtracao {

    // Testes subtração para A = 1
    @Test
    public void sub11() {
        Math c = new Math();
        int rOb = c.sub( 1, 1);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub12(){
        Math c = new Math();
        int rOb = c.sub(1,2);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub1_1(){
        Math c = new Math();
        int rOb = c.sub(1,-1);
        int rEs = 2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub1_2(){
        Math c = new Math();
        int rOb = c.sub(1,-2);
        int rEs = 3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub10(){
        Math c = new Math();
        int rOb = c.sub(1,0);
        int rEs = 1;
        assertEquals(rEs, rOb);
    }

    // testes com o valor A sendo 2
    @Test
    public void sub21(){
        Math c = new Math();
        int rOb = c.sub(2,1);
        int rEs = 1;
        assertEquals( rEs, rOb);
    }
    @Test
    public void sub22(){
        Math c = new Math();
        int rOb = c.sub(2,2);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub2_1(){
        Math c = new Math();
        int rOb = c.sub(2,-1);
        int rEs = 3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub2_2(){
        Math c = new Math();
        int rOb = c.sub(2,-2);
        int rEs = 4;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub20(){
        Math c = new Math();
        int rOb = c.sub(2,0);
        int rEs = 2;
        assertEquals(rEs, rOb);
    }
    // Para valores de A sendo -1
    @Test
    public void sub_11(){
        Math c = new Math();
        int rOb = c.sub(-1,1);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_12(){
        Math c = new Math();
        int rOb = c.sub(-1,2);
        int rEs = -3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_1_1(){
        Math c = new Math();
        int rOb = c.sub(-1,-1);
        int rEs = 0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_1_2(){
        Math c = new Math();
        int rOb = c.sub(-1,-2);
        int rEs = 1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_10(){
        Math c = new Math();
        int rOb = c.sub(-1,0);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    // Testes para A sendo -2
    @Test
    public void sub_21(){
        Math c = new Math();
        int rOb = c.sub(-2,1);
        int rEs = -3;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_22(){
        Math c = new Math();
        int rOb = c.sub(-2,2);
        int rEs = -4;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_2_1(){
        Math c = new Math();
        int rOb = c.sub(-2,-1);
        int rEs = -1;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_2_2(){
        Math c = new Math();
        int rOb = c.sub(-2,-2);
        int rEs = -0;
        assertEquals(rEs, rOb);
    }
    @Test
    public void sub_2_0(){
        Math c = new Math();
        int rOb = c.sub(-2,-0);
        int rEs = -2;
        assertEquals(rEs, rOb);
    }

}
