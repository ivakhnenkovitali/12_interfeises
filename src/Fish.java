import Interfaces.ISwim;
import Interfaces.IWag;



public class Fish extends Pet implements ISwim, IWag {
    public Fish() {
    }

    public Fish(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("Рыбка " + getNickname()+ " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Рыбка " + getNickname() + " плавает");
    }

    @Override
    public void wag() {
        System.out.println("Рыбка " + getNickname() + " виляет");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fish{");
        sb.append("color=").append(getColor());
        sb.append(", nickname='").append(getNickname()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
