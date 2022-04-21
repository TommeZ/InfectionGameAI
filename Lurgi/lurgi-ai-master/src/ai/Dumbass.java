package ai;

import model.Move;
import model.State;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: DrMark
 * Date: 9/11/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Simplest possible AI. Simply makes legal moves at random. Doesn't use minmaxing.
 */
public class Dumbass implements AI {

    Random random;

    public Dumbass() {
        random = new Random();
    }


    @Override
    public Move nextMove(State board) {
        /* Get list of valid moves. */
        ArrayList<Move> moves = board.validMoves();

        /* Pick one at random. */
        int index;
        if (moves.size() == 1) index = 0;
            else index = random.nextInt(moves.size()-1);

        System.out.println("Dumbass Heuristic: " + index);
        
        return moves.get(index);
    }
}
