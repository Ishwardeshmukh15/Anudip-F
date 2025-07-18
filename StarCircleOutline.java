public class StarCircleOutline {
    public static void main(String[] args) {
        int radius = 10; 
        double thickness = 0.5; 

        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                
                double distance = Math.sqrt(x * x + y * y);

                if (distance >= radius - thickness && distance <= radius + thickness) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
