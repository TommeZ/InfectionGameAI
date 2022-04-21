package ai;

import model.Move;
import model.State;

/**
 * Created with IntelliJ IDEA.
 * User: DrMark
 * Date: 9/11/13
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Implement this interface to create an AI.
 */
public interface AI {

    /**
     * Called when your AI should decide on its move.
     * @param board The current state of the board.
     * @return The move the AI wants to make.
     */
    Move nextMove(State board);


}
