
import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {
    Product product = new Product();
    while(true) {
      //product.first(int num);
      switch (product.firstMenu()) {
        case 1:
          product.Create();
          break;
        case 2:
          product.Update();
          break;
        case 3:
          product.Delete();
          break;
        case 4:
          System.out.println("시스템을 종료합니다.");
          System.exit(0);
      }
    }

  }

}