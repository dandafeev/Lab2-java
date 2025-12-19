package move;
import ru.ifmo.se.pokemon.*;

public class fireblast extends SpecialMove {
    public fireblast(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppEffects (Pokemon target){
        if (Math.random() <= 0.1) {
            Effect.burn(target);
        }
    }

    @Override
    protected String describe(){
        String result = "Выполнил атаку Fire Blast";
        return result;
    }
}