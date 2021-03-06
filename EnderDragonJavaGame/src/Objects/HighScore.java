package Objects;

import java.awt.*;

import Game.Game;

import java.io.File;
import java.net.URL;

import static javafx.scene.input.DataFormat.URL;

/**
 * Created by Anton on 09-Jun-16.
 */
public class HighScore {

    private String score;
    private Font font;

    public HighScore(int score) {
        this.score = Integer.toString(score);
        this.font = new Font("Serif", Font.PLAIN, 22);

    }

    public void tick(int score) {
        this.score = Integer.toString(score);

    }

    public void render(Graphics g) {
        g.setFont(font);
        g.setColor(Color.LIGHT_GRAY);
        g.drawString(score,570,Game.HEIGHT-30);
        g.setColor(Color.black);
        g.drawString(score,571,Game.HEIGHT-31);
    }

}
