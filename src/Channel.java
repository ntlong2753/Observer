import java.util.ArrayList;

class Channel {

    ArrayList<Observer> subs = new ArrayList<>();

    void subscribe(Observer o) {
        subs.add(o);
    }

    void notifyUser(String msg) {
        for (Observer o : subs) {
            o.update(msg);
        }
    }
}