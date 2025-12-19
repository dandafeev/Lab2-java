import pokemon.*;
import move.*;
import ru.ifmo.se.pokemon.Battle;

public class fight {
    public static void main(String[] args) {
        Battle b = new Battle();
        espurr p1 = new espurr( "", 1);
        kartana p2 = new kartana("", 1);
        nidorina p3 = new nidorina("", 1);
        meowsticm p4 = new meowsticm("", 1);
        nidoranf p5 = new nidoranf("", 1);
        nidoqueen p6 = new nidoqueen("", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
