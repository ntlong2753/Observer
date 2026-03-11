public class Main {
    public static void main(String[] args) {
        Channel c = new Channel();

        User u1 = new User("A");
        User u2 = new User("B");

        c.subscribe(u1);
        c.subscribe(u2);

        c.notifyUser("new video");
    }
}