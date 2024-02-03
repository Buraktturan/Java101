package BoxMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Burak",30,100,89,50);
        Fighter f2 = new Fighter("Büşra",40,100,70,50);

        Match match = new Match(f1,f2,90,70);
        match.run();
     }
}
