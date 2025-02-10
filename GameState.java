import java.util.HashSet;
import java.util.Set;

public class GameState {
  private boolean wolfLeft, goatLeft, cabbageLeft, boatLeft;

  public GameState() {
    wolfLeft = goatLeft = cabbageLeft = boatLeft = true;
  }

  public boolean moveItem(String item) {
    switch(item){
      case "wolf":
        if(boatLeft == wolfLeft){
          wolfLeft = !wolfLeft;
          boatLeft = !boatLeft;
        } else {
          return false;
        }
        break;

      case "goat":
        if(boatLeft == goatLeft){
          goatLeft = !goatLeft;
          boatLeft = !boatLeft;
        } else {
          return false;
        }
        break;

      case "cabbage":
        if(boatLeft == cabbageLeft){
          cabbageLeft = !cabbageLeft;
          boatLeft = !boatLeft;
        } else {
          return false;
        }
        break;

      case "alone":
        boatLeft = !boatLeft;
        break;

      default:
        return false;
    }

    return isValidState();
  }

  public boolean isValidState() {
    if(
      (wolfLeft == goatLeft && boatLeft != wolfLeft) ||
      (goatLeft == cabbageLeft && boatLeft != goatLeft)
      ){
        return false;
    }

    return true;
  }

  public boolean isSolved() {
    return !wolfLeft && !goatLeft && !cabbageLeft && !boatLeft;
  }
}