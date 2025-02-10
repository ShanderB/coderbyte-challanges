import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
  public List<String[]> readMovesFromCsv(String filePath) throws IOException {
    List<String[]> moveSequences = new ArrayList<>();

    try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null){
        String[] moves = line.split(",");
        moveSequences.add(moves);
      }
    } catch (IOException e){
      e.printStackTrace();
    }
    return moveSequences;
  }
}