public class main {
    public static void main(String[] args) {
        AbstractFactory factory = new SuperFactory();
        Airpods pods;
        ipad pad;
        pods=factory.createAirpods();
        pods.out();
        pad=factory.createipad();
        pad.out();
    }
}
