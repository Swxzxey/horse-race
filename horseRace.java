public class horseRace {
    public static void main(String[] args) {
        Race newrace = new Race(5);
        Horse horse1 = new Horse('1', "doobie", 0.5);
        newrace.addHorse(horse1, 1);
        Horse horse2 = new Horse('2', "doob", 0.5);
        newrace.addHorse(horse2, 2);
        Horse horse3 = new Horse('3', "do", 0.5);
        newrace.addHorse(horse3, 3);
        newrace.startRace();
    }
}
