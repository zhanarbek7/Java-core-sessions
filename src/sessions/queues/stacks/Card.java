package sessions.queues.stacks;

public class Card {
    private String name;

    public String getName() {
        return name;
    }

    public Card(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                '}';
    }
}
