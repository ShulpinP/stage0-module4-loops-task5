package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int x=1;x<=cathetusLength;x++) {
            for (int y=1;y<=cathetusLength; y++) {
                if (y<=x) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
                if (y == cathetusLength) {
                    System.out.println();
                }
            }
        }

    }
}
