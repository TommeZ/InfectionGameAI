package ai;

import model.Move;
import model.State;

/**
 * Minmaxing AI that works based on its piece count. This is the simplest possible minmaxing AI and is
 * actually quite strong, but better heuristics can beat it easily.
 */
public class Defensive extends MinMaxingAI {
    public Defensive() {
        super(2);
    }

    @Override
    public int heuristic(State toBoard, int us, int them) {
        int hueristic = (toBoard.countPieces(us));
        
//        System.out.println("Defensive Heuristic: " + hueristic);
        
        return hueristic;
    }
}
