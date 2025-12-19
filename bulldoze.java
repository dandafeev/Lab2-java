package move;
import ru.ifmo.se.pokemon.*;

public class bulldoze extends PhysicalMove {
    public bulldoze(double pow, double acc) {
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        Effect effect = new Effect().stat(Stat.SPEED, -1);
        target.addEffect(effect);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Bulldoze";
        return result; }
    }
