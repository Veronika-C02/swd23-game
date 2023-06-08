package at.campus02.swd.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player implements GameObject{

    private Texture image;
    private Sprite sprite;


    public Player(Texture image) {
        this.image = image;
        this.sprite = new Sprite(image);
    }


    @Override
    public void act(float delta) {
    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    public float getPositionX(){
       return sprite.getX();
    }

    public float getPositionY(){
        return sprite.getY();
    }


    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }


}
