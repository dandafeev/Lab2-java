package move;
import ru.ifmo.se.pokemon.*;

public class dreameater extends SpecialMove {
    public dreameater(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppDamage (Pokemon target, double damage) {
        if(target.getCondition() == Status.SLEEP);
        super.applyOppDamage(target, damage);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Dream Eater";
        return result; }
}
