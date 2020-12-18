package SecondQuestion;

public class CarFactoryA implements CarProduct{
    @Override
    public ShowCar product() {
        return new ProductCarA();
    }
}
