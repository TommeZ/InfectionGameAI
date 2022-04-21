/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.ArrayList;
import model.Move;
import model.State;

/**
 *
 * @author tommy.parker
 */
public class MyAI extends MinMaxingAI {

    public static final int XSIZE = 10;
    public static final int YSIZE = 10;

    public MyAI() {
        super(2);
    }

    @Override
    public int heuristic(State toBoard, int us, int them) {

        int usTotal = toBoard.countPieces(us);
        int heuristic = 0;

        // Arrangement of pieces on the board
        for (int x = 0; x < XSIZE; x++) {
            for (int y = 0; y < YSIZE; y++) {

                // Around our pieces
                if (toBoard.pieceAt(x, y) == us) {
                    for (int dx = -2; dx <= 2; dx++) {
                        for (int dy = -2; dy <= 2; dy++) {
                            if (State.inBounds(x + dx, y + dy)) {

                                // Empty pieces around next position
                                if (toBoard.pieceAt(x + dx, y + dy) == 0) {
                                    heuristic += 1;
                                }

                                // Allied pieces around next position
                                if (toBoard.pieceAt(x + dx, y + dy) == us) {
                                    heuristic += 1;
                                }

                                // Opponent pieces around player
                                if (toBoard.pieceAt(x + dx, y + dy) == them) {
                                    for (int px = -2; px <= 2; px++) {
                                        for (int py = -2; py <= 2; py++) {
                                            if (State.inBounds(x + px, y + py)) {

                                                // If next result would end in our pieces being around theirs
                                                if (toBoard.pieceAt(x + px, y + py) == us) {
                                                    heuristic += 1;
                                                }

                                                // Opponent pieces around players future position that could counter attack
                                                if (toBoard.pieceAt(x + px, y + py) == them) {
                                                    heuristic -= 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }

        // Sum of allied pieces
        heuristic += usTotal;

        // Ensures heuristic does not exceed expected values
        if (heuristic > 9998) {
            heuristic = 9998;
        }
        if (heuristic < 1) {
            heuristic = 1;
        }

//        System.out.println("myAI Heuristic: " + heuristic);

        return heuristic;
    }

}
