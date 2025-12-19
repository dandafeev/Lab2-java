package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class nidorina extends nidoranf {
    public nidorina (String name, int level){
        super(name, level);
        this.setStats(70, 62, 67, 55, 55, 56);
        this.setType(Type.POISON);

        doubleteam dt = new doubleteam(0, 0);
        this.addMove(dt);
        thunder th = new thunder(110,70);
        this.addMove(th);
        growl gw = new growl(0,100);
        this.addMove(gw);
    }
}
