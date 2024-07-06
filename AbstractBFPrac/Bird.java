package AbstractBFPrac;

public class Bird extends Animal {
  private double widthWing;

  public Bird(String name, int age, double widthWing){
    super(name, age);
    this.widthWing = widthWing;
  }

  public void makeSound(){
    System.out.println(getName() + "이(가) 짹짹 소리냅니다.");
  }

  public void AnimalInfo(){
    System.out.println("날개 길이: "+ widthWing + "미터");
  }

  public double getWidthWing() {
    return widthWing;
  }

  public void setWidthWing(double widthWing) {
    this.widthWing = widthWing;
  }
}
