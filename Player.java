public class Player {
    PlayerModel character;
    String name;
    int deaths = 0;

    public Player(String n, PlayerModel p) {
        name = n;
        character = p;

    }

    public String getName() {
        return name;
    }

    public PlayerModel getCharacter() {
        return character;
    }

    public int getDeaths() {
        return deaths;
    }

    public void increaseDeaths() {
        deaths++;
    }

    public String toString() {
        return "Name : " + name + "\n" + character.getName() + " : " + deaths;
    }
}