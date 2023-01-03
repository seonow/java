package jan_2;

public class TestGreeting {

	public static void main(String[] args) {
		Greeting hello = new Greeting();
		//new + 생성자를 통해서 변수를 만든다
		//new Greeting을 hello에 담는다
		//참조형타입
		//객체와 클래스의 개념을 이해하기
		//지금은 객체는 클래스로부터 만들어지 하나의 샘플이라 생각하자
		//객체를 만들기 위해서 전단계로 클래스가 필요하다
		hello.greet();

	}

}
// 왜 function에 로직을 집어넣을까?
// 재사용을 위해서 , 지속적으로 굴리기 위해서

//Objects
//Group a related set of attributes and behaviors into a class

// Frameworks and APIs
// Large Groups of objects that support a complex activity:
// Frameworks can be used as is or be modified to extend the basic behavior

//모른다면 뭘 모르는지 정리를 해놓을 것 그러면 추후에 그냥 하다보면 언젠가 극복할 수 있다 모른다고 거기서 멈추지 말 것

//OOP의 3대 속성 1.캡슐화 2.상속 3.다형성

//극복해야하는 고비 1.객체와 클래스의 차이 2. 다형성 이해하기

//------------------------------------
//Basic syntax of a Java class:
//<modifier>* class <class_name>{
//<attribute_declaration>* 속성(타입)선언
//<constructor_declaration>* 생성자선언
//<method_declaration>* 메서드선언
//}

//Example:
//public class Vehicle{
//	private double maxLoad;
//	public void setMaxLoad(double value){
//		maxLoad = value;
//	}
//}
//------------------------------------

//기존의 API를 참고해서 메서드의 이름을 정함
//delete는 물리적 삭제, remove는 논리적 삭제