public class Validator {
  public boolean validateGame(String[] moves) {
    GameState gameState = new GameState();

    for(String move : moves){
      if(!gameState.moveItem(move)){
        return false;
      }
    }
    return gameState.isSolved();
  }
}