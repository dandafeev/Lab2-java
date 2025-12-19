package move;
import ru.ifmo.se.pokemon.*;

public class icebeam extends SpecialMove {
    public icebeam(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <=0.1)
            Effect.freeze(target);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Ice Beam";
        return result; }
}
