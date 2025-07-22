package test.map.hashmap;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.UUID;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/6/21 15:06
 */
public class Test {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 1; i<14 ; i++){
            if (i < 13) {
                map.put(getKey(),i);//首次创建hashmap的数组+链表
            }else if(i == 13){
                map.put(getKey(),i);//首次扩张数组
            }
        }
        BigDecimal bigDecimal = new BigDecimal("1000.0000");
        BigDecimal bigDecimal2 = new BigDecimal("1000.0000");
        System.out.println(bigDecimal.equals(bigDecimal2));

        String a = "1772515498295169024";
        String[] as = a.split(",");
        System.out.println(map.get(null));
    }

    public static String getKey(){
        return UUID.randomUUID().toString();
    }

}
