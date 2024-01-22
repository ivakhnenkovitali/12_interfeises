import Interfaces.IPlay;
import Interfaces.ISwim;

public class MCune extends Cat implements ISwim, IPlay {

    public MCune() {
    }

    public MCune(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println("Мейн кун " + getNickname() + " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Мейн кун " + getNickname() + " плавает");
    }

    @Override
    public void play() {
        System.out.println("Мейн кун " + getNickname() + " играет");
    }

    @Override
    public void wag() {
        System.out.println("Мейн кун " + getNickname() + " виляет");

    }

    @Override
    public String toString(){
    final StringBuilder sb = new StringBuilder("MCune{");
        sb.append("color=").append(getColor());
        sb.append(", nickname='").append(getNickname()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
