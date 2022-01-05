package designPattern.singletone;

public class MySingletone {
    public volatile static MySingletone currentMySingletone = null;

    private MySingletone() {
    }

    public static MySingletone getInstance() {
        if (currentMySingletone == null) {
            synchronized (MySingletone.class) {
                if (currentMySingletone == null) {
                    currentMySingletone = new MySingletone();
                }
            }
        }
        return currentMySingletone;
    }

    public String getMsg(){
        return "";
    }
}
