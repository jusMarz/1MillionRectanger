public class Rectangle
{
    private int cornerX;
    private int cornerY;
    private int length;
    private int width;

    public Rectangle(int x, int y, int len, int width)
    {
        cornerX = x;
        cornerY = y;
        length = len;
        this.width = width;
    }

    public Rectangle()
    {
        cornerX = Math.;
        cornerY = y;
        length = len;
        this.width = width;
    }

    public int getCornerX() {
        return cornerX;
    }

    public void setCornerX(int cornerX) {
        this.cornerX = cornerX;
    }

    public int getCornerY() {
        return cornerY;
    }

    public void setCornerY(int cornerY) {
        this.cornerY = cornerY;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean overlap(Rectangle rect1, Rectangle rect2) {
        boolean doesOverlap = false;
        if ((rect1.getCornerX() == rect2.getCornerX()) && (rect1.getCornerY() == rect2.getCornerY()))
        {
            doesOverlap = true;
        }
        else if((rect1.getCornerX()+rect1.getWidth()>=rect2.getCornerX())&&(rect1.getCornerY()-rect1.getLength()<=rect2.getCornerY()))
        {
            doesOverlap = true;
        }
    }
}
