package com.game.tictactoe.util;

import com.game.tictactoe.domain.Player;
import org.springframework.stereotype.Component;

@Component
public class GameBoard {

    private final char[][] board = new char[3][3];

    public void setPositionOfPlayerOnBoard(Player player, int row, int column) {

        board[row][column] = player.getValue();
    }
}