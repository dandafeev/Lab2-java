package move;
import ru.ifmo.se.pokemon.*;

public class metalsound extends SpecialMove {
    public metalsound(double pow, double acc){
        super(Type.STEEL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon target){
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -2);
        target.addEffect(effect);
    }

    @Override
    protected String describe() {
        String result = "выполнил атаку Metal Sound";
        return result;}
}

