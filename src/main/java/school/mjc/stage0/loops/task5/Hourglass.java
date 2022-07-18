package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int x=1;x<=height;x++) {
            for (int y = 1; y <= height; y++) {
                if ((x>=1) && (y<=height) && (((x+y<=height+1) && (x<=y))||((x+y>=height+1) && (x>=y)))) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
                if (y==height) {
                    System.out.println();
                }

            }
        }
    }
}
