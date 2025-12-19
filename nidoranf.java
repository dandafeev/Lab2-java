package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class nidoranf extends Pokemon {
    public nidoranf (String name, int level){
        super(name, level);
        this.setStats(55, 47, 52, 40, 40, 41);
        this.setType(Type.POISON);

        doubleteam dt = new doubleteam(0, 0);
        this.addMove(dt);
        thunder th = new thunder(110,70);
        this.addMove(th);

    }
}
