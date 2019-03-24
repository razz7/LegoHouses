
package FunctionLayer;

/**
 *
 * @author rh
 */
public class Calculator {

    public static House createPartList(House house) {
        for (int i = 0; i < house.getHeight(); i++) {
            boolean evenLayer = (i % 2 == 0);
            house.addBrick(createLayer(house.getLength(), house.getWidth(), evenLayer));
        }
        return house;
    }
    private static Brick createLayer(int length, int width, boolean even) {
        Brick layers = new Brick();
        BrickSides s1ands3;
        BrickSides s1and4;
        if (even) { 
            s1ands3 = createSide(length);
            s1and4 = createSide(width - 4); 
        } else { 
            s1ands3 = createSide2(length - 4); 
            s1and4 = createSide2(width); 
        }
        layers.setLength(s1ands3);
        layers.setWidth(s1and4);
        return layers ;
    }

    private static BrickSides createSide(int prikker) {
        int fourXtwo = prikker / 4; 
        int twoXtwo = (prikker % 4) / 2;
        int oneXtwo = ((prikker % 4) - twoXtwo * 2);
        BrickSides side = new BrickSides();
        side.setBricks(" 4X2", fourXtwo);
        side.setBricks(" 2X1", twoXtwo);
        side.setBricks(" 1X1", oneXtwo);
        return side;
    }
    
    private static BrickSides createSide2(int prikker) {
        int fourXtwo = prikker / 4; 
        int twoXtwo = (prikker % 4) / 2;
        int oneXtwo = ((prikker % 4) - twoXtwo * 2);
        BrickSides side = new BrickSides();
        side.setBricks(" 4X2", fourXtwo);
        side.setBricks(" 2X2", twoXtwo);
        side.setBricks(" 1X2", oneXtwo);
        return side;
    }

}