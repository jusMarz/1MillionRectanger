public class Main {
    public static void main(String[] args) {
        System.out.println("Imma rectangle");
        Rectangles[] rectanglesAMillion = new Rectangles[1000000];
        for (int i = 0; i < 100000; i++)
        {
            rectanglesAMillion[i] = new Rectangles();
        }
        for (int i = 0; i < 100000; i++)
        {
            System.out.println(rectanglesAMillion[i]);
        }
    }
}