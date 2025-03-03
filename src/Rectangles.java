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

    @Override
    public String toString() {
        return ("X: " + cornerX + ", " + "Y: " + cornerY + ", " + "length: " + length + ", " + "Width: " + width);
    }
}
