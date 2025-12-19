package move;
import ru.ifmo.se.pokemon.*;

public class doubleteam extends SpecialMove {
    public doubleteam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon user) {
        Effect effect = new Effect().stat(Stat.EVASION, 1);
        user.addEffect(effect);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Double Team";
        return result; }
}
