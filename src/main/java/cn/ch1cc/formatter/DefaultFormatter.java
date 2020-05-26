package cn.ch1cc.formatter;

import java.time.format.DateTimeFormatter;

/**
 * 默认的formatter
 *
 * @author ChicC
 */
public enum DefaultFormatter {
    /**
     * 年-月-日
     */
    Y_M_D(DateTimeFormatter.ofPattern("uuuu-MM-dd")),

    /**
     * 年-月-日 时:分:秒
     */
    Y_M_D_H_M_S(DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss"));

    private DateTimeFormatter dateTimeFormatter;

    DefaultFormatter(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    public DateTimeFormatter getDateTimeFormatter() {
        return dateTimeFormatter;
    }
}

