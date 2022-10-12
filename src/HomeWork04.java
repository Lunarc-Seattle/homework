public class HomeWork04 {
    public static void main(String[] args) {
        int[] oldarr = { 1, 2 , 3};
        A04 a04 = new A04();
        int[] newArr1 = a04.copyArr(oldarr);


        for (int i =0;i<newArr1.length ; i++){
            System.out.println(newArr1[i] );
        }
    }
}
class A04{
    public int[] copyArr (int[] oldArr){
        int[] newArr = new int[ oldArr.length];
        for (int i=0; i<oldArr.length; i++){
            newArr[i] = oldArr[i];

        }
        return newArr;
    }
}
