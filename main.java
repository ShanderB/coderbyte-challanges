import java.util.List;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    CsvReader csvReader = new CsvReader();
    Validator validator = new Validator();

    try{
      List<String[]> moveSequences = csvReader.readMovesFromCsv("game_moves.csv");

      for (int i = 0; i < moveSequences.size(); i++) {
        boolean isValid = validator.validateGame(moveSequences.get(i));
        System.out.println("Sequence " + (i + 1) + " is " + (isValid ? "valid" : "invalid"));
      }
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}