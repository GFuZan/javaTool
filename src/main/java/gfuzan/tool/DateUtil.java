package gfuzan.tool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具
 * 
 * @author gfuzan
 */
public class DateUtil {
    
    /**
     * 获取月的开始时间(精确到毫秒)
     * 
     * @param date
     *                 基准时间
     * @return
     */
    public static Date getBeginMonth(Date date) {
        Calendar cale = Calendar.getInstance();
        if (date != null) {
            cale.setTime(date);
        }
        cale.set(Calendar.DAY_OF_MONTH, 1);
        cale.set(Calendar.HOUR_OF_DAY, 0);
        cale.set(Calendar.MINUTE, 0);
        cale.set(Calendar.SECOND, 0);
        cale.set(Calendar.MILLISECOND, 0);
        return cale.getTime();
    }
    
    /**
     * 日期加减
     * 
     * @param date
     *                 基准时间
     * @param num
     *                 加减几天
     * @return
     */
    public static Date getDayAdd(Date date, int num) {
        Calendar cale = Calendar.getInstance();
        if (date != null) {
            cale.setTime(date);
        }
        cale.add(Calendar.DAY_OF_MONTH, num);
        return cale.getTime();
    }
    
    /**
     * 月份加减
     * 
     * @param date
     *                 基准时间
     * @param num
     *                 加减几月
     * @return
     */
    public static Date MonthAdd(Date date, int num) {
        Calendar cale = Calendar.getInstance();
        if (date != null) {
            cale.setTime(date);
        }
        cale.add(Calendar.MONTH, num);
        return cale.getTime();
    }
    
    /**
     * 获取日的开始时间(精确到毫秒)
     * 
     * @param date
     *                 基准时间
     * @return
     */
    public static Date getBeginDay(Date date) {
        Calendar cale = Calendar.getInstance();
        if (date != null) {
            cale.setTime(date);
        }
        cale.set(Calendar.HOUR_OF_DAY, 0);
        cale.set(Calendar.MINUTE, 0);
        cale.set(Calendar.SECOND, 0);
        cale.set(Calendar.MILLISECOND, 0);
        return cale.getTime();
    }
    
    /**
     * 获取非空时间
     * 
     * @param date
     *                 基准时间
     * @return
     */
    public static Date getDateNotNull(Date date) {
        if (date == null) {
            date = new Date();
            date.setTime(0);
        }
        return date;
    }
    
    /**
     * 格式化日期时间
     *
     * @return
     * @date 日期
     */
    public static String getFormatTime(Object value) {
        if (value != null && value instanceof Date) {
            Date d = (Date) value;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(d);
        }
        return null;
    }
}
