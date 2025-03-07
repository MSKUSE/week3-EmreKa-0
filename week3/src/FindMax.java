public class FindMax {

    public static void main(String[] args) {
        int max = 0;
        for(int i = 0;i<args.length;i++){
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            }
        }
        System.out.println(max);
    }
}
