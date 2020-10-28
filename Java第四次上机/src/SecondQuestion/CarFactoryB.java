package SecondQuestion;

public class CarFactoryB implements CarProduct{
    @Override
    public ShowCar product() {
        return new ProductCarB();
    }
}
