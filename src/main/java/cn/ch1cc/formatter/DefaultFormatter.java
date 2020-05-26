package cn.ch1cc.formatter;

import java.time.format.DateTimeFormatter;

/**
 * @author ChicC
 * @date 2020/3/19 001914:31
 * @desc 默认的formatter
 */
public class DefaultFormatter {
    /**
     * 年-月-日formatter
     */
    public static final DateTimeFormatter Y_M_D = DateTimeFormatter.ofPattern("uuuu-MM-dd");
    /**
     * 年-月-日 时:分:秒
     */
    public static final DateTimeFormatter Y_M_D_H_M_S = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");

}
