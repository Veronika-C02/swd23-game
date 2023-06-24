package at.campus02.swd.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements GameObject, Observable {

    private Texture image;
    private Sprite sprite;

    private boolean isliving = true; // Für die Angirffsfunktion die man dann in der Player Klasse finden wird

    private List<PositionObserver> oberservers = new ArrayList<PositionObserver>();


    public Enemy(Texture image) {
        this.image = image;
        this.sprite = new Sprite(image);
    }


    public void addObserver(PositionObserver obs) {
        this.oberservers.add(obs);
    }

    public void removeObserver(PositionObserver obs) {
        this.oberservers.remove(obs);
    }


    @Override
    public void act(float delta) {
    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);

        for (PositionObserver oberserver : oberservers) {
            oberserver.update(getPositionX(), getPositionY());
        }
    }

    public float getPositionX() {
        return sprite.getX();
    }

    public float getPositionY() {
        return sprite.getY();
    }


    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    public boolean getIsliving() {
        return isliving;
    }

    public void setIsliving(boolean isliving) {
        this.isliving = isliving;
    }
}
