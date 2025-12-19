package move;
import ru.ifmo.se.pokemon.*;

public class darkpulse extends SpecialMove {
    public darkpulse(double pow, double acc) {
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.2)
            Effect.flinch(target);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Dark Pulse";
        return result; }
}
