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
 * @date 2020/3/19 001914:57
 */
public class Str2Date extends DefaultFormatter {

    public static Date byDate(String sqlTime) {
        return byDate(sqlTime, Y_M_D);
    }

    public static Date byDate(String sqlTime, DateTimeFormatter formatter) {
        Instant instant = LocalDate.parse(sqlTime, formatter).atStartOfDay(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public static Date byDateTime(String sqlTime) {
        return byDateTime(sqlTime, Y_M_D_H_M_S);
    }

    public static Date byDateTime(String sqlTime, DateTimeFormatter formatter) {
        Instant instant = LocalDateTime.parse(sqlTime, formatter).atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

}
