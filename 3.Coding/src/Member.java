public class Member {
    private Personaje character;

    public Member(Personaje character) {
        this.character = character;
    }

    public Personaje getCharacter() {
        return character;
    }

    public void setCharacter(Personaje character) {
        this.character = character;
    }
}