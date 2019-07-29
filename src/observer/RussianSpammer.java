package observer;

public class RussianSpammer extends Subject {
    public RussianSpammer(String name) {
        super(name);
    }

    public void setLatestPost(String lastestPost) {
        this.latestPost = lastestPost;
    }

}
