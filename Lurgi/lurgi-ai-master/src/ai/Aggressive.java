package ai;

import model.Move;
import model.State;

/**
 * Minmaxing AI that works on the opponent's piece count alone. This is actually very weak and tends to commit
 * suicide early on because it doesn't consider the safety of its own pieces. If you allow it to play a few
 * turns so that it doesn't kill itself, it becomes more powerful. Increasing the search depth also works, but
 * slows down the play considerably. A good first exercise is to modify this AI so that it doesn't kill itself on
 * low depth.
 */
public class Aggressive extends MinMaxingAI {
    public Aggressive() {
        super(2);
    }

    @Override
    public int heuristic(State toBoard, int us, int them) {
        int hueristic = 1000-(toBoard.countPieces(them));
        
        System.out.println("Aggressive Heuristic: " + hueristic);
        
        return hueristic;
    }
}
