package com.catan;

/*
  Q3 - Move class
  Represents a move in the game. Does not currently support all move types, but is sufficient for the stub agent.
*/
public class Move {
  public enum Type {
    END_TURN,
    ROLL_DICE,
    OFFER_TRADE,
    ACCEPT_TRADE,
    DECLINE_TRADE,
  }

  private final Type type;

  private Move(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public static Move endTurn() {
    return new Move(Type.END_TURN);
  }

  public static Move rollDice() {
    return new Move(Type.ROLL_DICE);
  }

  public static Move offerTrade() {
    return new Move(Type.OFFER_TRADE);
  }

  public static Move acceptTrade() {
    return new Move(Type.ACCEPT_TRADE);
  }

  public static Move declineTrade() {
    return new Move(Type.DECLINE_TRADE);
  }
}
