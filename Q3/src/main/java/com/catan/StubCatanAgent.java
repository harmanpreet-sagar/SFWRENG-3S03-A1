package com.catan;

import java.util.List;
import java.util.Map;

/*
  Q3 - StubCatanAgent class by Jinwoo Hong
  Implements the CatanAgent interface and returns canned responses for all moves to provide the game with an agent with known and deterministic behavior..
*/
public final class StubCatanAgent implements CatanAgent {

  private int playerId;
  private final Move initialSettlement;
  private final Move initialRoad;
  private final Move cannedMove;
  private final ResourceType cannedResource;
  private final DevelopmentCard cannedDevelopmentCard;


  public StubCatanAgent() {
    this.initialSettlement = Move.endTurn();
    this.initialRoad = Move.endTurn();
    this.cannedMove = Move.endTurn();
    this.cannedResource = ResourceType.WOOD;
    this.cannedDevelopmentCard = DevelopmentCard.KNIGHT;
  }

  @Override
  public void init(int playerId) {
    this.playerId = playerId;
  }

  @Override
  /*
    Return a canned move.
  */
  public Move chooseInitialSettlement(GameState state) {
    return initialSettlement;
  }

  @Override
  /*
    Return a canned move.
  */
  public Move chooseInitialRoad(GameState state) {
    return initialRoad;
  }

  @Override
  /*
    Return a canned move.
  */
  public Move chooseMove(GameState state) {
    return cannedMove;
  }

  @Override
  /*
    Return a canned empty map.
  */
  public Map<ResourceType, Integer> chooseDiscard(GameState state, int discardCount) {
    return Map.of();
  }

  @Override
  /*
    Return a canned resource.
  */
  public ResourceType chooseResource(GameState state) {
    return cannedResource;
  }

  @Override
  /*
    Return a canned target (first possible target, -1 if no targets).
  */
  public int chooseRobberTarget(GameState state, List<Integer> possibleTargets) {
    if (possibleTargets.isEmpty()) {
      return -1;
    }
    return possibleTargets.get(0);  
  }

  @Override
  /*
    Return a canned development card.
  */
  public DevelopmentCard chooseDevelopmentCard(GameState state) {
    return cannedDevelopmentCard;
  }
}
