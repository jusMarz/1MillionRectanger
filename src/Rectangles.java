public class Rectangles
{
    private int cornerX;
    private int cornerY;
    private int length;
    private int width;

    public Rectangles(int x, int y, int len, int wid)
    {
        cornerX = x;
        cornerY = y;
        length = len;
        width = wid;
    }

    public Rectangles()
    {
        cornerX = (int) (Math.random() * 51);
        cornerY = (int) (Math.random() * 51);
        length = (int) (Math.random() * 41) + 10;
        width = (int) (Math.random() * 6) + 5;
    }

    public int getCornerX() {
        return cornerX;
    }

    public int getCornerY() {
        return cornerY;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public static boolean overlap(Rectangles rect1, Rectangles rect2) {
        boolean doesOverlap = false;
        if ((rect1.getCornerX() == rect2.getCornerX()) && (rect1.getCornerY() == rect2.getCornerY()))
        {
            doesOverlap = true;
        }
        if((rect1.getCornerX()+rect1.getWidth()>=rect2.getCornerX())&&(rect2.getCornerX()>=rect1.getCornerX()))
        {
            if((rect1.getCornerY()-rect1.getLength()<=rect2.getCornerY()&&(rect2.getCornerY()<=rect1.getCornerY())))
            {
                doesOverlap = true;
            }
        }
        if((rect2.getCornerX()+rect2.getWidth()>=rect1.getCornerX())&&(rect1.getCornerX()>=rect2.getCornerX()))
        {
            if((rect2.getCornerY()-rect2.getLength()<=rect1.getCornerY()&&(rect1.getCornerY()<=rect2.getCornerY())))
            {
                doesOverlap = true;
            }
        }
        return doesOverlap;
    }

    @Override
    public String toString() {
        return ("X: " + cornerX + ", " + "Y: " + cornerY + ", " + "length: " + length + ", " + "Width: " + width);
    }
}
