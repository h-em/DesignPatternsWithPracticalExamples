package singleton;

public class Main {

    public static void main(String[] args) {

        SingleObject obj = SingleObject.getInstance();
        obj.display();

        OnlineMusicStore musicStore = OnlineMusicStore.getInstance();
    }
}
