public class SuperFactory implements AbstractFactory{
    @Override
    public Airpods createAirpods(String param) {
        return new Airpodspro();
    }

    @Override
    public ipad createAirtag(String parma) {
        return new ipadpro();
    }
}
