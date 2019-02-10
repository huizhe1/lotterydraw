package xyz.huizhe.lotterydraw.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author huizhe
 * @date 2019/1/5
 * @time 10:43
 */
public class DateUtil {

    private static ZoneId chinaZoneId = ZoneId.of("Asia/Shanghai");

    public static LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    private static LocalDateTime localDateTime = LocalDateTime.now(chinaZoneId);
    private static ZonedDateTime zonedDateTime = localDateTime.atZone(chinaZoneId);
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static Date localDateTimeToDate(LocalDateTime otherlocalDateTime){
        ZonedDateTime dateTime = otherlocalDateTime.atZone(chinaZoneId);
        return Date.from(dateTime.toInstant());
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), chinaZoneId);
    }

    public static Date getNowDate(){
        return Date.from(zonedDateTime.toInstant());
    }

    public static String localDateTimeToString(LocalDateTime dateTime) {
        return dateTimeFormatter.format(dateTime);
    }

    public static LocalDateTime stringToLocalDate(String date) {
        return LocalDateTime.parse(date, dateTimeFormatter);
    }

    public static Date stringToDate(String date) {
        return localDateTimeToDate(LocalDateTime.parse(date, dateTimeFormatter));
    }
}
