public class ComputeHMS {
    public static void main(String[] args) {
        int second = 380;
        int[] result = computeHMS(second);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] computeHMS(int seconds) {
        int[] hms = new int[3];
        if (seconds >= 3600) {
            hms[0] = seconds / 3600;
            seconds = seconds % 3600;
        } else {
            hms[0] = 0;
        }
        if (seconds >= 60) {
            hms[1] = seconds / 60;
            seconds = seconds % 60;
        } else {
            hms[1] = 0;
        }
        hms[2] = seconds;

        return hms;
    }
}
