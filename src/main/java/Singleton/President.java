package Singleton;

final public class President {

    private static President instance;

    public President() {
    }

    public static President getInstance(){
        if(!(instance == null)) {
            instance = new President();
        }
        return instance;
    }

    protected Object clone() {

        return null;
    }

    private Object wakeup() {
        return null;
    }
}
