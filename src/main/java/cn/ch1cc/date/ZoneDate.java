package cn.ch1cc.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author ChicC
 */
public class ZoneDate {
    /**
     * 获取当前时区的date
     * format:false
     *
     * @return date
     */
    public static Date ymd() {
        return Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 以当前date获取daysToPlus天后的Date
     * format:false
     *
     * @return Date
    public static Date ymdPlusDays(long daysToPlus) {
    return ymdPlusDays(daysToPlus, new Date());
    }

     *//**
     * 以当前date获取daysToPlus天前的Date
     * format:false
     *
     * @return Date
     *//*
    public static Date ymdMinusDays(long daysToMinus) {
        return ymdMinusDays(daysToMinus, new Date());
    }*/

    /**
     * @param daysToMinus 多少天前
     * @param date        dateobj
     *
     * @return date date对象
     */
    public static Date ymdMinusDays(long daysToMinus, Date date) {
        if (daysToMinus < 0) {
            throw new IllegalArgumentException("Argument Cannot Be Less Than 0");
        }
        Instant instant = date.toInstant();
        return Date.from(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).minusDays(daysToMinus).atZone(ZoneId.systemDefault()).toInstant());
    }


    /**
     * 获取daysToPlus天后的Date
     * format:false
     *
     * @return Date
     */
    public static Date ymdPlusDays(long daysToPlus, Date date) {
        if (daysToPlus < 0) {
            throw new IllegalArgumentException("Argument Cannot Be Less Than 0");
        }
        Instant instant = date.toInstant();
        return Date.from(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).plusDays(daysToPlus).atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 根据秒转换为date
     *
     * @return Date
     */
    public static Date second2Date(Long date) {
        return Date.from(Instant.ofEpochSecond(date));
    }

}
