package test.map.hashmap;


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
        for(int i = 1; i<50 ; i++){
            if (i < 13) {
                map.put(getKey(),i);//首次创建hashmap的数组+链表
            }else if(i == 13){
                map.put(getKey(),i);//首次创建hashmap的数组+链表
            }
        }

    }

    public static String getKey(){
        return UUID.randomUUID().toString();
    }

}
