class User implements Observer {
    String name;

    User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received " + message);
    }
}