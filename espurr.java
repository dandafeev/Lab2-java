package pokemon;
import move.*;
import ru.ifmo.se.pokemon.*;

public class espurr extends Pokemon {
    public espurr (String name, int level){
        super(name, level);
        this.setStats(62, 48, 54, 63, 60, 68);
        this.setType(Type.PSYCHIC);

        chargebeam cb = new chargebeam(50, 90);
        this.addMove(cb);
        darkpulse dp = new darkpulse(80, 100);
        this.addMove(dp);
        dreameater de = new dreameater(100,100);
        this.addMove(de);
    }
}