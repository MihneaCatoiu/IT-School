package session_20_recap.practice.test.IT;

public class GameTest {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Bow());
        gameCharacter.attack();
    }
}