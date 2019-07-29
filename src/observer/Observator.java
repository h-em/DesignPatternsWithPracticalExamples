package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Observator {
    protected String name;
    protected List<Subject> observedSubjectList;
    protected Map<Subject, String> latestMessages;

    public Observator(String name) {
        this.name = name;
        observedSubjectList = new ArrayList<>();
        latestMessages = new HashMap<>();
    }

    public void update(Subject subjectWhoTriggred) {
        if (observedSubjectList.contains(subjectWhoTriggred)) {
            String preveiousMessage = latestMessages.get(subjectWhoTriggred);
            String currentMessage = subjectWhoTriggred.getLatestPost();
            if (preveiousMessage == null
                    || preveiousMessage.compareTo(currentMessage) != 0) {
                System.out.println("I am  " + this.name
                        + " and I recived an update from "
                        + subjectWhoTriggred.getName() + " "
                        + currentMessage);
                latestMessages.put(subjectWhoTriggred, currentMessage);
            }
        }
    }

    public void follow(Subject subject) {
        observedSubjectList.add(subject);
        subject.addfolowers(this);
    }

    public void unFollow(Subject subject) {
        observedSubjectList.remove(subject);
        subject.removeFolowers(this);
    }
}
