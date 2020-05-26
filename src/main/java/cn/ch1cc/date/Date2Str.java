package cn.ch1cc.date;

import cn.ch1cc.formatter.DefaultFormatter;
import cn.ch1cc.str.Str2Date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author ChicC
 * @date 2020/3/19 001914:40
 */
public class Date2Str extends DefaultFormatter {

    public static String byDate() {
        return byDate(Y_M_D);
    }

    public static String byDate(Date date) {
        return byDate(Y_M_D, date);
    }

    public static String byDate(String ymdhmsDate) {
        return byDate(Y_M_D, ymdhmsDate);
    }

    public static String byDate(DateTimeFormatter formatter) {
        return LocalDateTime.now().format(formatter);
    }

    public static String byDate(DateTimeFormatter formatter, Date date) {
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(formatter);
    }

    public static String byDate(DateTimeFormatter formatter, String ymdhms) {
        Date date = Str2Date.byDateTime(ymdhms, formatter);
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(Y_M_D);
    }

    public static String byDateTime() {
        return byDateTime(Y_M_D_H_M_S);
    }

    public static String byDateTime(Date date) {
        return byDateTime(Y_M_D_H_M_S, date);
    }

    public static String byDateTime(String ymdDate) {
        return byDateTime(Y_M_D_H_M_S, ymdDate);
    }

    public static String byDateTime(DateTimeFormatter formatter) {
        return LocalDateTime.now().format(formatter);
    }

    public static String byDateTime(DateTimeFormatter formatter, Date date) {
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(formatter);
    }

    public static String byDateTime(DateTimeFormatter formatter, String ymdDate) {
        Date ymd = Str2Date.byDate(ymdDate, formatter);
        Instant instant = ymd.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(Y_M_D_H_M_S);
    }


    public static String ymdPlusDays(long daysToAdd) {
        return LocalDateTime.now().plusDays(daysToAdd).format(Y_M_D);
    }

    public static String ymdMinusDays(long daysToAdd) {
        return LocalDateTime.now().minusDays(daysToAdd).format(Y_M_D);
    }
}
