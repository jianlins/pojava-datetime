package org.pojava.datetime;

import org.junit.Test;

import java.util.GregorianCalendar;

public class TestDateTime {
    @Test
    public void test12() {
        DateTimeConfig dcfg = DateTimeConfig.getDateTimeConfig(new GregorianCalendar(78 + 2000, 4, 22).getTime());
        DateTime utilDate = new DateTime("July of 1909", dcfg);
        System.out.println(utilDate);
        System.out.println(new DateTime("2/23/77", dcfg));
    }

    @Test
    public void test13() {
        DateTimeConfig dcfg = DateTimeConfig.getDateTimeConfig(new GregorianCalendar(78 + 2000, 4, 22).getTime());
        DateTime utilDate = new DateTime("11/82", dcfg);
        System.out.println(utilDate);
    }

    @Test
    public void test14() {
        DateTimeConfig dcfg = DateTimeConfig.getDateTimeConfig(new GregorianCalendar(78 + 2000, 4, 22).getTime());
        DateTime utilDate = new DateTime("2081-08-07 00:00:00.0", DateTimeConfig.getDateTimeConfig(null));
        System.out.println(utilDate);
    }


    @Test
    public void test15() {
        DateTimeConfig dcfg = DateTimeConfig.getDateTimeConfig(new GregorianCalendar(78 + 2000, 4, 22).getTime());
        DateTime utilDate = new DateTime("2072", DateTimeConfig.getDateTimeConfig(null));
        System.out.println(utilDate);
    }

    @Test
    public void test16() {
        DateTimeConfig dcfg = DateTimeConfig.getDateTimeConfig(new GregorianCalendar(78 + 2000, 4, 22).getTime());
        DateTime utilDate = new DateTime("February", dcfg);
        System.out.println(utilDate);
    }


    @Test
    public void test17() {
        DateTimeConfig dcfg = DateTimeConfig.getDateTimeConfig(new GregorianCalendar(78 + 2000, 4, 22).getTime());
        DateTime utilDate = new DateTime("February", DateTimeConfig.getDateTimeConfig(null));
        System.out.println(utilDate);
        utilDate = new DateTime("February");
        System.out.println(utilDate);
    }
}
