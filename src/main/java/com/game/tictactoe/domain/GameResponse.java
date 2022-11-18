package com.game.tictactoe.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

public class GameResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Player currentPlayer;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Player nextPlayer;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warning;

    public GameResponse(String status, String result) {
        this.status = status;
        this.result = result;
    }

    public GameResponse(Player currentPlayer, Player nextPlayer, String status) {
        this.currentPlayer = currentPlayer;
        this.nextPlayer = nextPlayer;
        this.status = status;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }

    public String getWarning() {
        return warning;
    }
}