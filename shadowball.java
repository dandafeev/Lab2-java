package move;
import ru.ifmo.se.pokemon.*;

public class shadowball extends SpecialMove {
    public shadowball(double pow, double acc) {
        super(Type.GHOST, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        if (Math.random() <=0.2)
        target.addEffect(effect);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Shadow Ball";
        return result; }
}
