package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage player, ground;

    private static final int width = 32, height = 32;


    public static void init() {
        try {
            SpriteSheet knight1 = new SpriteSheet(ImageLoader.loadImage("/textures/knight1.png"));
            SpriteSheet floor1 = new SpriteSheet(ImageLoader.loadImage("/textures/floor1.png"));

            player = knight1.crop(0, 0, width, height);
            ground = floor1.crop(0, 0, 2*width, height);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
