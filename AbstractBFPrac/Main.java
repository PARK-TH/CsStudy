package AbstractBFPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("새의 이름을 입력하세요");
      String name = br.readLine();

      System.out.println("새의 나이를 입력하세요");
      int age = Integer.parseInt(br.readLine());

      System.out.println("새의 날개 길이를 입력하세요");
      double width = Double.parseDouble(br.readLine());

      Animal bird = new Bird(name, age, width);

      bird.animalInfo();
      bird.makeSound();
      System.out.println(bird.getName()+"의 날개 길이는 "+width + "입니다.");
    } catch (IOException e) {
      System.err.println("입력이 제대로 되지 않았습니다.");
    } catch (NumberFormatException e) {
      System.err.println("숫자가 잘못 입력되었습니다");
    }
  }
}
