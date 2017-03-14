/*
  Author: Levi Willmeth
  Written for OSU CS362 - Software Engineering II
  Assignment 1 - Dominion
*/
package dominion;

public class Dominion{

  public void setupGame(boolean p1Bot, boolean p2Bot){
    GameState game = new GameState();

    game.addPlayer("Amy", p1Bot);
    game.addPlayer("Billy", p2Bot);

    while(game.checkEndConditions())
      game.nextTurn();
  }
}
