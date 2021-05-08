package br.com.alexsd;

import static org.junit.Assert.*;


import org.junit.Test;

public class CardinalPointsTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailWithInvalidCardinalPoint() {
        CardinalPoints.findDirectionByValue("K");
    }

    @Test
    public void shouldGetCarditionalPoint(){
        var cardinalPoint = CardinalPoints.findDirectionByValue("N");
        assertEquals(CardinalPoints.NORTH, cardinalPoint);
    }

}