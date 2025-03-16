class Advanced6 {
    public static void main(String [] args) {

        int width = 5;
        int height = 5;
        int start = (width - 1) / 2;
        int end = start;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(j >= start && j <= end ? 0 : " ");
            }

            System.out.print("\n");

            if (i < (height - 1) / 2) {
                start --;
                end ++;
            } else {
                start ++;
                end --;
            }
        }
    }
}