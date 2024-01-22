import Interfaces.IPlay;

public class British extends Cat implements IPlay {


    public British() {
    }

    public British(String nickname, Color color) {
        super(nickname, color);
    }

    @Override
    public void eat() {
        System.out.println(" Британский кот " + getNickname()+ " кушает" );
    }

    @Override
    public void play() {
        System.out.println(" Британский кот " + getNickname()+ " играет" );
    }

    @Override
    public void wag() {
        System.out.println(" Британский кот " + getNickname()+ " виляет" );
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("British{");
        sb.append("color=").append(getColor());
        sb.append(", nickname='").append(getNickname()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
