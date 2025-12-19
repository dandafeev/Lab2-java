package move;
import ru.ifmo.se.pokemon.*;

public class chargebeam extends SpecialMove {
    public chargebeam(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon user) {
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        if (Math.random() <= 0.7)
        user.addEffect(effect);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Charge Beam";
        return result; }
}
