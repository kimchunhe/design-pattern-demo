package designPattern;

import designPattern.singletone.MySingletone;

public class Sample {
    public static void main(String[] args) throws Exception {
        MySingletone mySingletone1 = MySingletone.getInstance();
        MySingletone mySingletone2 = MySingletone.getInstance();
        if(mySingletone1.equals(mySingletone2)) {
            System.out.println("单例模式配置成功");
        }
    }
}
