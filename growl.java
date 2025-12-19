package move;
import ru.ifmo.se.pokemon.*;

public class growl extends StatusMove {
    public growl(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        Effect effect = new Effect().stat(Stat.ATTACK, -1);
            target.addEffect(effect);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Growl";
        return result; }
}
