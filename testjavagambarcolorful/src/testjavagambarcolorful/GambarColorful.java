package testjavagambarcolorful;

public class GambarColorful {

    public static boolean isColorful(int[][] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                int r = (pixels[i][j] >> 16) & 0xFF;
                int g = (pixels[i][j] >> 8) & 0xFF;
                int b = pixels[i][j] & 0xFF;

                if (r != g || r != b || g != b) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] pixels = {
                {87, 76, 63},
                {67, 76, 73},
                {99, 105, 93},
                {178, 173, 169},
                {48, 35, 46},

                {22, 20, 18},
                {10, 40, 50},
                {67, 76, 73},
                {173, 166, 167},
                {87, 76, 63},

                {10, 40, 50},
                {99, 105, 93},
                {178, 173, 169},
                {67, 76, 73},
                {22, 20, 18},

                {22, 20, 18},
                {87, 76, 63},
                {140, 132, 139},
                {87, 76, 63},
                {99, 105, 93},

                {99, 105, 93},
                {87, 76, 63},
                {67, 76, 73},
                {173, 166, 167},
                {48, 35, 46}
        };

        if (isColorful(pixels)) {
            System.out.println("Gambar colorful");
        } else {
            System.out.println("Gambar hitam-putih");
        }
    }
}