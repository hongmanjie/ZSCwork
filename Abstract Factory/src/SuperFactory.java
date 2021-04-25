public class SuperFactory implements AbstractFactory{
    @Override
    public Airpods createAirpods() {
        return new Airpodspro();
    }

    @Override
    public ipad createipad() {
        return new ipadpro();
    }
}
