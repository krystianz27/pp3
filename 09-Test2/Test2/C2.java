public class C2 {
    public static boolean m(int[] numbers) {
        int counter_positive = 0;
        int counter_negative = 0;
        for (int i : numbers) {
            if (i >= 0) {
                counter_positive += i;
            } 
            else {
                counter_negative += Math.abs(i);
                
            }
        }
        return counter_positive > counter_negative;
    }


    // public static void main(String[] args) {
    //     int[] n1 = {9,3,4,-2,8};
    //     int[] n2 = {9,0,2,-7,-9,4,1,-5};
    //     System.out.println(C2.m(n2));
    // }
}
