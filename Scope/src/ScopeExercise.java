public class ScopeExercise {
    public static void main(String[] args) {
        int k;
        {
            k = 4;
            System.out.println(k);
            {
                System.out.println(k);
                k = 8;
            }
        }
        System.out.println(k);
    }
}
