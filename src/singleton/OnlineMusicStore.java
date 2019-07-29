package singleton;


public class OnlineMusicStore {

    private static OnlineMusicStore INSTANCE;
    private OnlineMusicStore(){
        System.out.println("new Instance");
    }

    public static OnlineMusicStore getInstance() {
        if (INSTANCE == null) {
            synchronized (OnlineMusicStore.class) {
                if (INSTANCE == null)
                    return new OnlineMusicStore();
            }
        }
        return INSTANCE;
    }
}
