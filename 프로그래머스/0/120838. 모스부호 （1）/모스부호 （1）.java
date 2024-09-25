import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] lets = letter.split(" ");
        String[] morseArr = {
    ".- a", "-... b", "-.-. c", "-.. d", ". e", "..-. f",
    "--. g", ".... h", ".. i", ".--- j", "-.- k", ".-.. l",
    "-- m", "-. n", "--- o", ".--. p", "--.- q", ".-. r",
    "... s", "- t", "..- u", "...- v", ".-- w", "-..- x",
    "-.-- y", "--.. z"
    };
        Map<String,String> map = new HashMap<>();
          for (String morse : morseArr) {
            String[] splitMorse = morse.split(" ");
            map.put(splitMorse[0], splitMorse[1]);
        }
        StringBuffer sb = new StringBuffer();
        for(String let:lets){
            sb.append(map.get(let));
        }
        
        return sb.toString();
    }
}