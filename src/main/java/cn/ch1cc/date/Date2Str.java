package cn.ch1cc.date;

import cn.ch1cc.formatter.DefaultFormatter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author ChicC
 */
public class Date2Str {
    public static String byDate() {
        return byDate(DefaultFormatter.Y_M_D.getDateTimeFormatter());
    }

    public static String byDate(Date date) {
        return byDate(DefaultFormatter.Y_M_D.getDateTimeFormatter(), date);
    }


    public static String byDate(DateTimeFormatter formatter) {
        return LocalDateTime.now().format(formatter);
    }

    public static String byDate(DateTimeFormatter formatter, Date date) {
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(formatter);
    }

    public static String byDateTime(DateTimeFormatter formatter) {
        return LocalDateTime.now().format(formatter);
    }

    public static String byDateTime(DateTimeFormatter formatter, Date date) {
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(formatter);
    }

    public static String byDateTime() {
        return byDateTime(DefaultFormatter.Y_M_D_H_M_S.getDateTimeFormatter());
    }

    public static String byDateTime(Date date) {
        return byDateTime(DefaultFormatter.Y_M_D_H_M_S.getDateTimeFormatter(), date);
    }
}
