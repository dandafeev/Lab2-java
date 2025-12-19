package move;
import ru.ifmo.se.pokemon.*;

public class thunder extends SpecialMove {
    public thunder(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <=0.3)
            Effect.paralyze(target);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Thunder";
        return result; }
}