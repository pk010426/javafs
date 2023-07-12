package a0712;

public class genericExam2 {
  public static void main(String[] args) {
      product<Tv, String> product1 = new product<>();

    product1.setKind(new Tv());
    product1.setModel("스마트 tv");

    Tv tv = product1.getKind();
    String tvModel = product1.getModel();
    System.out.println("product1의 kind : "+tv);
    System.out.println("product1의 model : "+tvModel);


    product<Car, String> product2 = new product<>();

    product2.setKind(new Car());
    product2.setModel("suv자동차");

    Car car = product2.getKind();
    String carModel = product2.getModel();
    System.out.println("product2의 car : "+ car);
    System.out.println("product2의 carModel : "+carModel);
    
    // product 객체 product1은 tv와 string을 타입 매개변수로 지정하여 생성되었습니다. 
    // product1.setKind(new Tv())를 통해 kind에는 Tv객체,
    // product1.setModel("스마트 tv")를 통해 model에는 "스마트 tv" 문자열 저장
  }


}
