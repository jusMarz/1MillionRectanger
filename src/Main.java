public class Main {
    public static void main(String[] args) {
        System.out.println("Imma rectangle");
        Rectangles original = new Rectangles(10,15,20,10);
        Rectangles[] rectanglesAMillion = new Rectangles[1000000];
        for (int i = 0; i < 1000000; i++)
        {
            rectanglesAMillion[i] = new Rectangles();
        }
        double sum = 0;
        for (int i = 0; i < 1000000; i++)
        {
            System.out.println(rectanglesAMillion[i]);
            System.out.println(Rectangles.overlap(original, rectanglesAMillion[i]));
            if (Rectangles.overlap(original, rectanglesAMillion[i]))
            {
                sum++;
            }
        }
        System.out.println(sum / 1000000);
    }
}