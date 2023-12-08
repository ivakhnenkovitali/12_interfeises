import Interfaces.IVoice;


public abstract class Cat extends Pet implements IVoice {



    public Cat() {
    }

    public Cat(String nickname, Color color) {
        super(nickname, color);
    }








    @Override
    public void voce() {
        System.out.println("котик " + getNickname()+ " мяукает");
    }
}
