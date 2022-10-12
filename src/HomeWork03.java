import org.omg.CORBA.PUBLIC_MEMBER;

public class HomeWork03 {
    public static void main(String[] args) {
        double price = 0.0;

        Book book = new Book();
        //double price1 = 0.0;
        price = book.updatePrice (price);
       // System.out.println(price );
    }
}

    class Book {
        //protected double price;

        public double updatePrice(double price) {
            if (price > 150) { price = 150.0; }
            else if (100.0 < price) { price = 100.0; }
            else { price = -1 ; System.out.println(" 输入异常 " ); }
            return price;
        }






//    }
//
//   class ReturnContext extends Book {
//       // ReturnContext returncontext = new ReturnContext();
//       public  ReturnContext ( ) {
//
//           if (super.price = -1.0) {
//               System.out.println(" 价格不在范围");
//           } else {
//               System.out.println(" 价格是" + super.price);
//           }
//
//       }
   }



