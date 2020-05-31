package interfaces;

public class Test {

    public static void main(String[] args) {
        Man man = new Man(31);
        Woman woman = new Woman(157.5);
        man.voice();
        woman.voice();
        Voice voice1 = new Man(44);
        Voice voice2 = new Woman(167.2);
    }

}
