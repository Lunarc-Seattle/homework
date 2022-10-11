public class HomeWork02 {
    public static void main(String[] args) {
        String[] stringsarr1 = {"q", "ww", "w"};
        A02 a02 = new A02();
        int index = a02.find("w", stringsarr1);
        System.out.println(index);
    }
}

    class A02 {
        public int find(String findtstring, String[] stringsarr) {
            for (int i = 0; i < stringsarr.length; i++) {
                if (findtstring.equals(stringsarr[i]))
                { return i; }

            }
            return -1;

        }

    }



