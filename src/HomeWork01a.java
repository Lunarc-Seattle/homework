public class HomeWork01a {
    public static void main(String[] args) {
        A01a a01a = new A01a();
        double[] arr2 = {1.2, 3.4, 2.3};
        double jieguo = a01a.max(arr2);
        System.out.println(jieguo );
    }
}


    class A01a{
        public double max(double[] arr ){
            double max = arr[0];

            for (int i =0;i<arr.length ; i++){
                if (max < arr[i] )
                { max = arr[i]; }
            }
            return max;
        }
    }

