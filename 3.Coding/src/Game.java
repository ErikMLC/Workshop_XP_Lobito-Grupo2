import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Member> leftBank;
    private List<Member> rightBank;
    private Member observer;

    public Game() {
        leftBank = new ArrayList<>();
        rightBank = new ArrayList<>();
        // Initialize the game with the observer and other members on the left bank
        observer = new Member(Personaje.FARMER);
        leftBank.add(observer);
        leftBank.add(new Member(Personaje.CABBAGE));
        leftBank.add(new Member(Personaje.GOAT));
        leftBank.add(new Member(Personaje.WOLF));
    }
    
    public void moveMember(Member member, List<Member> source, List<Member> destination) {
        if (source.contains(member)) {
            source.remove(member);
            destination.add(member);
        }
    }
    
    public boolean isGameOver() {
        return leftBank.isEmpty() || rightBank.isEmpty();
    }
public boolean isValidMove(Member member, List<Member> source, List<Member> destination) {
    // The observer must be on the same side as the member to move
    if (!source.contains(observer)) {
        return false;
    }

    // Create a temporary state to test the move
    List<Member> tempSource = new ArrayList<>(source);
    List<Member> tempDestination = new ArrayList<>(destination);
    tempSource.remove(member);
    tempDestination.add(member);

    // Check if the move leaves a valid state
    return isStateValid(tempSource) && isStateValid(tempDestination);
}

public boolean isStateValid(List<Member> bank) {
    // If the observer is present, the state is always valid
    if (bank.contains(observer)) {
        return true;
    }


    return true;
}

public void makeMove(Member member) {
    if (isValidMove(member, leftBank, rightBank)) {
        moveMember(member, leftBank, rightBank);
    } else if (isValidMove(member, rightBank, leftBank)) {
        moveMember(member, rightBank, leftBank);
    }
    }

    public Member getMember(Personaje character) {
        for (Member member : leftBank) {
            if (member.getCharacter() == character) {
                return member;
            }
        }
    
        for (Member member : rightBank) {
            if (member.getCharacter() == character) {
                return member;
            }
        }
    
        return null;
}



}