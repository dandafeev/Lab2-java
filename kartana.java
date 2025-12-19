package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class kartana extends Pokemon {
    public kartana (String name, int level){
        super(name, level);
        this.setStats(59, 181, 131, 59, 31, 109);
        this.setType(Type.ELECTRIC);

        fireblast fr = new fireblast(110, 85);
        this.addMove(fr);
        flamethrower ft = new flamethrower(90, 100);
        this.addMove(ft);
        bulldoze bl = new bulldoze(60,100);
        this.addMove(bl);
        metalsound ms = new metalsound(0,85);
        this.addMove(ms);
    }
}
