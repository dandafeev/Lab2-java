package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class nidoqueen extends nidorina {
    public nidoqueen (String name, int level){
        super(name, level);
        this.setStats(90, 92, 87, 75, 85, 76);
        this.setType(Type.POISON);

        doubleteam dt = new doubleteam(0, 0);
        this.addMove(dt);
        thunder th = new thunder(110,70);
        this.addMove(th);
        growl gw = new growl(0,100);
        this.addMove(gw);
        icebeam ib = new icebeam(90,100);
        this.addMove(ib);
    }
}