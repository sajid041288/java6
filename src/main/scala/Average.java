public class Average {
    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : ar) {
            sum += number;
        }
        double avg = sum / ar.length;
        System.out.println(avg);
    }
}