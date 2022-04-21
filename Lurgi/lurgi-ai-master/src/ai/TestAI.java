package ai;

import model.Move;
import model.State;

// Used to test static heuristic scores
public class TestAI extends MinMaxingAI {
    public TestAI() {
        super(2);
    }

    @Override
    public int heuristic(State toBoard, int us, int them) {
        int hueristic = 9000;
        System.out.println("TestAI Heuristic: " + hueristic);
        return hueristic;
    }
}
