public class Main {

    static void fill(int[][] a, int value) {
        int n = a.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = value;
    }

    static void drawRectangle(int[][] a, int height, int width) {
        int n = a.length;
        int startRow = (n - height) / 2;
        int startCol = (n - width) / 2;

        for (int i = startRow; i < startRow + height; i++)
            for (int j = startCol; j < startCol + width; j++)
                a[i][j] = 0;
    }

    static void drawCircle(int[][] a) {
        int n = a.length;
        int cx = n / 2;
        int cy = n / 2;
        int r = n / 3;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if ((i - cx) * (i - cx) + (j - cy) * (j - cy) <= r * r)
                    a[i][j] = 255;
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("java Main n rectangle");
            System.out.println("java Main n circle");
            return;
        }

        int n = Integer.parseInt(args[0]);
        String type = args[1];

        long startTime = System.nanoTime();

        int[][] a = new int[n][n];

        if (type.equalsIgnoreCase("rectangle")) {

            fill(a, 255); 

            int height = n / 3;
            int width = n / 2;

            drawRectangle(a, height, width);

        } else if (type.equalsIgnoreCase("circle")) {

            fill(a, 0); 
            drawCircle(a);

        } else {
            System.out.println("rectangle or circle.");
            return;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == 0)
                        System.out.print("\u2591");
                    else
                        System.out.print("\u2588");
                }
                System.out.println();
            }
        System.out.println("Execution time: " + duration + " ns");
    }
}
