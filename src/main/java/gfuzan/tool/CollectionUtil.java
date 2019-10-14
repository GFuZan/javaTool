package gfuzan.tool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 集合工具
 * 
 * @author gfuzan
 */
public class CollectionUtil {
    
    /**
     * 从集合中找到对象
     * 
     * @param collection
     *                       集合
     * @param comparable
     *                       比较方法
     * @return
     *         OR null
     */
    public static <T> T getObjectForCollection(Collection<T> collection, Comparable<T> comparable) {
        T res = null;
        
        if (collection != null) {
            if (comparable == null) {
                throw new NullPointerException("参数 comparable 不能为空");
            }
            
            for (T e : collection) {
                if (e != null && comparable.compareTo(e) == 0) {
                    res = e;
                    break;
                }
            }
        }
        return res;
    }
    
    /**
     * 将集合转为字符串
     * 
     * @param collection
     *                       集合
     * @param spilt
     *                       分隔符
     * @return
     */
    public static <T> String toString(Collection<T> collection, String spilt) {
        
        StringBuilder sb = new StringBuilder("");
        if (collection != null) {
            for (T e : collection) {
                sb.append(e).append(spilt);
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
    
    /**
     * 将list字符串转为List
     * 
     * @param listStr
     *                    list字串
     * @param spilt
     *                    分隔符
     * @return
     */
    public static List<String> parseList(String listStr, String spilt) {
        List<String> res = new ArrayList<String>();
        if (listStr != null) {
            String[] strings = listStr.split(spilt);
            for (String s : strings) {
                res.add(s);
            }
        }
        return res;
    }
}
