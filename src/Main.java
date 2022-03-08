public class Main {

    public static void main(String[] args) {
        MyThread c1 = new MyThread();
        MyThread c2 = new MyThread();
        MyThread c3 = new MyThread();
        MyThread c4 = new MyThread();

        c1.setName("Camel 1");
        c2.setName("Camel 2");
        c3.setName("Camel 3");
        c4.setName("Camel 4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
