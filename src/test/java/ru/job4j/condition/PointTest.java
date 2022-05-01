package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

        @Test
        public void when00to20then2() {
            double expected = 2;
            int x1 = 0;
            int y1 = 0;
            int x2 = 2;
            int y2 = 0;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when11to22then1dot4() {
            double expected = 1.4;
            int x1 = 1;
            int y1 = 1;
            int x2 = 2;
            int y2 = 2;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.1);
        }

        @Test
        public void when10to22then2dot2() {
            double expected = 2.2;
            int x1 = 1;
            int y1 = 0;
            int x2 = 2;
            int y2 = 2;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.2);
        }

        @Test
        public void when20to21then1() {
            double expected = 1;
            int x1 = 2;
            int y1 = 0;
            int x2 = 2;
            int y2 = 1;
            double out = Point.distance(x1, y1, x2, y2);
            Assert.assertEquals(expected, out, 0.01);
        }
}