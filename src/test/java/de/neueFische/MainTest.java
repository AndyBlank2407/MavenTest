package de.neueFische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void whenAdd_With1And2_thenExpect3() {
        //given
        int a=1;
        int b=2;
        int solution = 3; // nicht nötig...
        //when
        int actual = Main.add(a,b);
        //then
        assertEquals(solution, actual);// erster Parameter ist erw. Ergebnis, zweiter tatsächliches Ergebnis
    }

    @Test
    void whenCheck_With50_thenExpectFalse() {
        //given
        int curryWurst = 50;

        //when
        boolean actual = Main.check(curryWurst);

        //then
        assertFalse(actual);



    }
    @Test
    void whenChecked_With101_thenExpectTrue(){
        //given
        int currySchnitzel = 101;

        //when
        boolean actual = Main.check(currySchnitzel);

        //then
        assertTrue(actual);
    }

    @Test
    void whenTeilbarChecked_With_1() {
        //given
        int a = 1;
        String solution = "1";

        //when
        String actual = Main.checkTeilbar(a);

            //then
            assertEquals(solution, actual);
    }

    @Test
    void whenTeilbarChecked_With3(){
        //given
        int a = 3;
        String solution = "fizz";

        //when
        String actual = Main.checkTeilbar(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void whenTeilbarChecked_With5(){
        //given
        int a = 5;
        String solution = "buzz";

        //when
        String actual = Main.checkTeilbar(a);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void whenTeilbarChecked_With15(){
        //given
        int a = 15;
        String solution = "fizzbuzz";

        //when
        String actual = Main.checkTeilbar(a);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void whenTeilbarChecked_With_0() {
        //given
        int a = 0;
        String solution = "fizzbuzz";

        //when
        String actual = Main.checkTeilbar(a);

        //then
        assertEquals(solution, actual);
    }


    @Test
    void whenSmallerThanZeroChecked_With0(){
        //given
        int a = 0;

        //when
        boolean actual = Main.smallerThanZero(a);

        //then
        assertFalse(actual);
    }

    @Test
    void whenSmallerThanZeroChecked_With1(){
        //given
        int a = 1;

        //when
        boolean actual = Main.smallerThanZero(a);

        //then
        assertTrue(actual);
    }

    @Test
    void sumSquareOrSubstractChecked_With2And1AndFalse(){
        //given
        int a = 2;
        int b = 1;
        boolean y = false;
        int solution = 3;

       //when
        int actual = Main.sumSquareOrSubstract(a,b,y);

       //then
       assertEquals(solution, actual);

    }

    @Test
    void sumSquareOrSubstractChecked_With1And1AndFalse(){
        //given
        int a = 1;
        int b = 1;
        boolean y = false;
        int solution = 1;

        //when
        int actual = Main.sumSquareOrSubstract(a,b,y);

        //then
        assertEquals(solution, actual);

    }

    @Test
    void sumSquareOrSubstractChecked_With1And0AndFalse(){
        //given
        int a = 1;
        int b = 0;
        boolean y = false;
        int solution = 1;

        //when
        int actual = Main.sumSquareOrSubstract(a,b, y);

        //then
        assertEquals(solution, actual);

    }

    @Test
    void sumSquareOrSubstractChecked_With0And1AndFalse(){
        //given
        int a = 0;
        int b = 1;
        boolean y = false;
        int solution = 0;

        //when
        int actual = Main.sumSquareOrSubstract(a,b,y);

        //then
        assertEquals(solution, actual);

    }

    @Test
    void sumSquareOrSubstractChecked_With0And1AndTrue(){
        //given
        int a = 0;
        int b = 1;
        boolean y = true;
        int solution = 1;

        //when
        int actual = Main.sumSquareOrSubstract(a,b,y);

        //then
        assertEquals(solution, actual);

    }

    @Test
    void ladenKapazitätChecked_With30AndGelb(){
        //given
        int a = 30;
        String farbe = "gelb";
        String solution = "Maximale Personenzahl nicht überschritten";

        //when
        String actual = Main.ladenKapazität(a, farbe);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void ladenKapazitätChecked_With31AndGelb(){
        //given
        int a = 31;
        String farbe = "gelb";
        String solution = "Zu viele Personen";

        //when
        String actual = Main.ladenKapazität(a, farbe);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void ladenKapzitätChecked_With0AndRot(){
        //given
        int a = 0;
        String farbe = "rot";

        //when
        String actual = Main.ladenKapazität(a, farbe);

        //then
        assertEquals("Maximale Personenzahl nicht überschritten", actual);


    }

    @Test
    void ladenKapzitätChecked_WithMinus1AndRot(){
        //given
        int a = -1;
        String farbe = "rot";
        String solution = "Maximale Personenzahl nicht überschritten";

        //when
        String actual = Main.ladenKapazität(a, farbe);


        //then
        assertEquals(solution, actual);


    }

    @Test
    void ladenKapazitätChecked_With1AndRot(){
        //given
        int a = 1;
        String farbe = "rot";
        String solution = "Zu viele Personen";

        //when
        String actual = Main.ladenKapazität(a, farbe);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void ladenKapazitätChecked_With31AndGrün(){
        //given
        int a = 31;
        String farbe = "grün";
        String solution = "Maximale Personenzahl nicht überschritten";

        //when
        String actual = Main.ladenKapazität(a, farbe);

        //then
        assertEquals(solution, actual);
    }


    @Test
    void ladenKapazitätChecked_With61AndGrün(){
        //given
        int a = 61;
        String farbe = "grün";
        String solution = "Zu viele Personen";

        //when
        String actual = Main.ladenKapazität(a, farbe);

        //then
        assertEquals(solution, actual);
    }

    @Test
    void fakultätChecked_With0(){
        //given
        int a = 0;
        int solution = 1;

        //when
        int actual = Main.fakultät(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void fakultätChecked_With1(){
        //given
        int a = 1;
        int solution = 1;

        //when
        int actual = Main.fakultät(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void fakultätChecked_With2(){
        //given
        int a = 2;
        int solution = 2;

        //when
        int actual = Main.fakultät(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void fakultätChecked_With3(){
        //given
        int a = 3;
        int solution = 6;

        //when
        int actual = Main.fakultät(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void fakultätWhileChecked_With0(){
        //given
        int a = 0;
        int solution = 1;

        //when
        int actual = Main.fakultätWhile(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void fakultätWhileChecked_With1(){
        //given
        int a = 1;
        int solution = 1;

        //when
        int actual = Main.fakultätWhile(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void fakultätWhileChecked_With2(){
        //given
        int a = 2;
        int solution = 2;

        //when
        int actual = Main.fakultätWhile(a);

        //then
        assertEquals(solution,actual);
    }

    @Test
    void fakultätWhileChecked_With3(){
        //given
        int a = 3;
        int solution = 6;

        //when
        int actual = Main.fakultätWhile(a);

        //then
        assertEquals(solution,actual);
    }

}