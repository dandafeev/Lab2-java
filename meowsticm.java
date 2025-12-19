package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class meowsticm extends espurr {
    public meowsticm (String name, int level){
        super(name, level);
        this.setStats(74, 48, 76, 83, 81, 104);
        this.setType(Type.PSYCHIC);

        chargebeam cb = new chargebeam(50, 90);
        this.addMove(cb);
        darkpulse dp = new darkpulse(80, 100);
        this.addMove(dp);
        dreameater de = new dreameater(100,100);
        this.addMove(de);
        shadowball sb = new shadowball(80,100);
        this.addMove(sb);
    }
}