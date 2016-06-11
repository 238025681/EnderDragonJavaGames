package Objects;

import Game.Game;
import GraphicHandler.Assets;
import GraphicHandler.SpriteSheet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ProgressBar {
    private   int x = 65;
    private   int y = Game.HEIGHT - 50;  // place in the middle
    private final  int WIDTH = 500;  //changed so it will rise with 10 every bonus taken
    private final  int HEIGHT  = 22; //resized so scale to player img.
    private   int fillProgressBar = 0;
    private   boolean progress = false;
    private   Game game;
    private BufferedImage img;


    public ProgressBar(Game game) {

        this.game = game;
        this.img = Assets.progressBar;

    }

    public boolean isProgress() {
        return progress;
    }

    public void setProgress(boolean progress) {
        this.progress = progress;
    }

    public int getFillProgressBar() {
        return fillProgressBar;
    }

    public void setFillProgressBar(int fillProgressBar) {
        this.fillProgressBar = fillProgressBar;
    }



    public void tick() {

        if (progress) {
            fillProgressBar +=10;
        }
        if (fillProgressBar >= WIDTH) {
            game.gameState = Game.STATE.End;
        }
        progress = false;





    }

    public void render(Graphics g) {
        int alpha = 5; // 95% transparent
        Color myColour = new Color(255, 0, 0, alpha);
        g.setColor(myColour);
        g.fillRect(x, y, WIDTH, HEIGHT);
        /*g.setColor(Color.GRAY);
        g.fillRect(x, y, WIDTH, HEIGHT);*/
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 0 + fillProgressBar, HEIGHT);
        g.drawImage(img,x+fillProgressBar,y,null);


    }





}