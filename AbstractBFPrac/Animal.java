package AbstractBFPrac;

abstract class Animal {
  private String name;
  private int age;

  public Animal(String name,int age){
    this.name = name;
    this.age = age;
  }

  public abstract void makeSound();

  public void animalInfo(){
    System.out.println("이름: "+name+"\t나이: "+age);
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
