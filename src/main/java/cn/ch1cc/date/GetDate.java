package cn.ch1cc.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author ChicC
 * @date 2020/3/20 002010:57
 */
public class GetDate {

    public static Date ymd() {
        return Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

}
