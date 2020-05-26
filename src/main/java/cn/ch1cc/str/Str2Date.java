package cn.ch1cc.str;

import cn.ch1cc.formatter.DefaultFormatter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author ChicC
 */
public class Str2Date {

    public static Date byDate(String sqlTime) {
        return byDate(sqlTime, DefaultFormatter.Y_M_D.getDateTimeFormatter());
    }

    public static Date byDate(String sqlTime, DateTimeFormatter formatter) {
        Instant instant = LocalDate.parse(sqlTime, formatter).atStartOfDay(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public static Date byDateTime(String sqlTime) {
        return byDateTime(sqlTime, DefaultFormatter.Y_M_D_H_M_S.getDateTimeFormatter());
    }

    public static Date byDateTime(String sqlTime, DateTimeFormatter formatter) {
        Instant instant = LocalDateTime.parse(sqlTime, formatter).atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
}
