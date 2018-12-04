Past paper 2015
main idea: String, class
public class HiddenWord {
  private string puzzle;
  public HiddenWord(String hidddenWord) {
    this.puzzle = hiddenWord;
    }
  public String getHint(String guess) {
    String temp = "";
    for (int i = 0; i < guess.length(); i++) {
      if (puzzle.subString(i,i+1).equals(guess.subString(i,i+1)) {
        temp += puzzle.subString(i,i+1);
        }
      else if(puzzle.indexOf(guess.substring((i,i+1) != -1) {
        temp += "+";
        }
      else {
        temp += "*";
        }
      }
       return temp;
    }
  }
 }
