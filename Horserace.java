public class Horserace {
    public static void main(String[] args) {
        Race newrace = new Race(5);
        Horse horse1 = new Horse('1', "doobie", 0.6);
        newrace.addHorse(horse1, 1);
        horse1.setSymbol('\u0A5A');
        Horse horse2 = new Horse('2', "doob", 0.9);
        newrace.addHorse(horse2, 2);
        Horse horse3 = new Horse('3', "do", 0.5);
        newrace.addHorse(horse3, 3);
        newrace.startRace();
    }
}
