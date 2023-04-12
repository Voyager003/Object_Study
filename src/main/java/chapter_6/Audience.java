package chapter_6;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public long setTicket(Ticket ticket) {
        return bag.setTicket(ticket);
}
