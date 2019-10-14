package gfuzan.tool;

import java.math.BigDecimal;

/**
 * <b>BigDecimal工具</b>
 * <p>
 * <b>安全性:</b> 线程安全
 *
 * @author GFuZan
 */
public class BigDecimalUtil {
    
    /**
     * 计算精度
     */
    private static final int SCALE = 8;
    
    /**
     * 比较
     * 
     * @param num1
     *                 num1
     * @param num2
     *                 num2
     * @return 比较结果
     * @throws 无
     */
    public static boolean isEqual(BigDecimal num1, BigDecimal num2) {
        if (num1 == null) {
            if (num2 == null) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (num2 == null) {
                return false;
            }
            else {
                return (num1.setScale(5).compareTo(num2.setScale(5)) == 0);
            }
        }
    }
    
    /**
     * 获取非空值
     * 
     * @param num
     *                num
     * @return null -> ZERO
     * @throws 无
     */
    public static BigDecimal getNotNull(BigDecimal num) {
        if (num == null) {
            num = BigDecimal.ZERO;
        }
        return num;
    }
    
    /**
     * 加
     * 
     * @param num1
     *                 num1
     * @param num2
     *                 num2
     * @return 计算结果
     * @throws 无
     */
    public static BigDecimal add(BigDecimal num1, BigDecimal num2) {
        if (num1 == null) {
            num1 = BigDecimal.ZERO;
        }
        if (num2 == null) {
            num2 = BigDecimal.ZERO;
        }
        return num1.add(num2);
    }
    
    /**
     * 减
     * 
     * @param num1
     *                 num1
     * @param num2
     *                 num2
     * @return 计算结果
     * @throws 无
     */
    public static BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        if (num1 == null) {
            num1 = BigDecimal.ZERO;
        }
        if (num2 == null) {
            num2 = BigDecimal.ZERO;
        }
        return num1.subtract(num2);
    }
    
    /**
     * 乘
     * 
     * @param num1
     *                 被乘数
     * @param num2
     *                 乘数
     * @return 计算结果 or ZERO
     * @throws 无
     */
    public static BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        if (num1 == null || num2 == null || BigDecimal.ZERO.setScale(SCALE).compareTo(num2.setScale(SCALE)) == 0) {
            return BigDecimal.ZERO;
        }
        else {
            return num1.multiply(num2).setScale(SCALE);
        }
    }
    
    /**
     * 除
     * 
     * @param num1
     *                 被除数
     * @param num2
     *                 除数
     * @return 计算结果 or ZERO
     * @throws 无
     */
    public static BigDecimal devide(BigDecimal num1, BigDecimal num2) {
        if (num1 == null || num2 == null || BigDecimal.ZERO.setScale(SCALE).compareTo(num2.setScale(SCALE)) == 0) {
            return BigDecimal.ZERO;
        }
        else {
            return num1.divide(num2, SCALE, BigDecimal.ROUND_HALF_UP);
        }
    }
}
