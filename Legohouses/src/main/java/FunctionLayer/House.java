/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author rh
 */
public class House {

    private int length;
    private int width;
    private int height;
    private ArrayList<Brick> layers;

    public House(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        layers = new ArrayList();
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<Brick> getLayers() {
        return layers;
    }

    public HashMap<String, Integer> getTotalBricks() {
        HashMap<String, Integer> Bricks = new HashMap();
        Bricks.put("fourXtwo", 0);
        Bricks.put("twoXtwo", 0);
        Bricks.put("oneXtwo", 0);
        for (Brick l : layers) {
            int four2 = Bricks.get("fourXtwo");
            Bricks.put("four2", l.getLength().getBricks().get("four2") + four2);
            int two2 = Bricks.get("twoXtwo");
            Bricks.put("two2", l.getLength().getBricks().get("two2") + two2);
            int one2 = Bricks.get("oneXtwo");
            Bricks.put("one2", l.getLength().getBricks().get("one2") + one2);
        }

        return Bricks;
    }

    public void addBrick(Brick brick) {
        layers.add(brick);
    }

    @Override
    public String toString() {
        return "Legohouse{" + "length=" + length + ", width=" + width + ", height=" + height + ", layers=" + layers + '}';
    }

}
