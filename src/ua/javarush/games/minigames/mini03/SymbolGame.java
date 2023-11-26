package ua.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Проста програма
*/

public class SymbolGame extends Game {

    //напишіть тут ваш код
    @Override
    public void initialize() {
        String word = "JAVARUSH";
        char[] array = word.toCharArray();
        setScreenSize(8, 3);
        for (int x = 0; x < array.length; x++) {
            for (int y = 1; y <= 1; y++) {
                setCellValueEx(x, y, Color.ORANGE, String.valueOf(array[x]));
            }
        }
    }
}
