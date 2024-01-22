import Interfaces.IPlay;
import Interfaces.ISwim;

public class Norway extends Cat implements ISwim, IPlay {

    public Norway() {
    }

    public Norway(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("Норвежский кот" + getNickname() + " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Норвежский кот" + getNickname() + " плавает");
    }

    @Override
    public void play() {
        System.out.println("Норвежский кот" + getNickname() + " играет");
    }

    @Override
    public void wag() {
        System.out.println("Норвежский кот" + getNickname() + " виляет");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Norway{");
        sb.append("color=").append(getColor());
        sb.append(", nickname='").append(getNickname()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
