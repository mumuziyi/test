package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyDemo;

public class MenuState extends State{
    private Texture backGround;
    private Texture playBtn;


    public MenuState(GameStateManager gsm) {
        super(gsm);
        backGround = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(backGround,0,0, FlappyDemo.WIDTH,FlappyDemo.HEIGHT);
        sb.draw(playBtn,(FlappyDemo.WIDTH/2) - (playBtn.getWidth()/2),(FlappyDemo.HEIGHT/2));
        sb.end();
    }

    @Override
    public void dispose() {
        backGround.dispose();
        playBtn.dispose();
    }

}
