package adapter.pattern;

public class MovableAdapterImpl implements MovableAdapter {
    private final Movable sportCar;

    public MovableAdapterImpl(Movable car) {
        sportCar = car;
    }

    private double convertMPHtoKMH(double mph) {
        return mph * 1.60934;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMH(sportCar.getSpeed());
    }
}
