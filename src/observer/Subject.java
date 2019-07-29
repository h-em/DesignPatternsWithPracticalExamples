package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected String name;
    protected List<Observator> observerList;
    protected String latestPost = null;

    public Subject(String name){
        this.name = name;
        observerList = new ArrayList<>();
    }

    public void postNewEvent(String text){
        latestPost = text;
        updateFolowers();
    }

    public  void updateFolowers(){
        for (Observator observator : observerList){
            observator.update(this);
        }
    }

    public void addfolowers(Observator observator) {
        observerList.add(observator);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatestPost() {
        return latestPost;
    }

    public void setLatestPost(String latestPost) {
        this.latestPost = latestPost;
    }

    public void removeFolowers(Observator observator){
        observerList.remove(observator);
    }
}
