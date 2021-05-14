package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Tube {
    private static final int FLUCTUATION = 130;
    private static final int TUBE_GAP = 100;
    private static final int LOWEST_opening = 120;
    private Vector2 posTopTube,posBtmTube;
    private Random rand;
    private Texture bottomTube,topTube;

    public Tube(float x){
        bottomTube = new Texture("bottomtube.png");
        topTube = new Texture("toptube.png");
        rand = new Random();

        posTopTube = new Vector2(x,rand.nextInt(FLUCTUATION) + TUBE_GAP + LOWEST_opening);
        posBtmTube = new Vector2(x,posTopTube.y-TUBE_GAP - bottomTube.getHeight());
    }

    public Vector2 getPosTopTube() {
        return posTopTube;
    }

    public Vector2 getPosBtmTube() {
        return posBtmTube;
    }

    public Texture getBottomTube() {
        return bottomTube;
    }

    public Texture getTopTube() {
        return topTube;
    }
}
