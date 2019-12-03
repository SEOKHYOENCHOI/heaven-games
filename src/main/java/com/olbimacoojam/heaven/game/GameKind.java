package com.olbimacoojam.heaven.game;

import lombok.Getter;

import static com.olbimacoojam.heaven.game.GameType.NONE;
import static com.olbimacoojam.heaven.game.GameType.SCORE;
import static com.olbimacoojam.heaven.game.GameType.WIN_LOSE;

@Getter
public enum GameKind {
    MINE(WIN_LOSE), MAFIA(WIN_LOSE), SONG(SCORE), BASEBALL(NONE), LADDER(NONE), DRAW(NONE);

    private GameType gameType;

    GameKind(GameType gameType) {
        this.gameType = gameType;
    }

    public Integer getScorePerCount() {
        return gameType.getScorePerCount();
    }

    public boolean isScoreType() {
        return gameType.equals(SCORE);
    }
}
