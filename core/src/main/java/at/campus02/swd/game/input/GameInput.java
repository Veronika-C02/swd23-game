package at.campus02.swd.game.input;

import at.campus02.swd.game.gameobjects.Tile;
import com.badlogic.gdx.InputAdapter;

public class GameInput extends InputAdapter {

    @Override
    public boolean keyDown(int keycode) {
        System.out.println(keycode);

        // execute() ?? --> statt sout von Pfeilen
            // Spieler bewegen mit Methode execute();

        return true;
    }
}
