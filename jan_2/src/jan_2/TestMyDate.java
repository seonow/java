		package jan_2;

		public class TestMyDate {
			
			int abc;
			int efg = abc + 10 ;
			
			public static void main(String[] args) {
				MyDate m = new MyDate();
				m.setDay(2);
				m.setMonth(1);
				m.setYear(2023);

				int goal = 5;
				int win = goal + 10;
				System.out.println(win);
				
				String dayInfo = m.getDetails();
				System.out.println(dayInfo);
			}
		}

		// 리턴타입과 받는녀석이 일치하여야한다

		//생성자는 class명과 동일하다
		//생성자 객체를 생성할 때 쓴다
		//클래스는 한개 이상의 생성자를 가지고 있다

		//코드 내부에 생성자가 없을때 컴파일 할때 자바는 디폴트생성자를 끼워넣는다
		//디폴트생성자는 arguments()가 없다
		//디폴트생성자는 body{}가 비어있다
		//디폴트생성자의 모습 : MyDate(){
//						   }
		//new xxx()의 형식으로 생성할 수 있다

		//import 다른 패키지에 있는 클래스를 가져와서 사용하겠다

		//주석을 어떻게 적어야 할까?
		//코드 작성자가 어떤 의도로 코드를 작성했는지를 다른 사람이 봐도 알 수 있게 해줘야한다
		//의도가 필요하다 예)폰트를 크게 했다(이유:노인이 주고객층이라서), 하지만 주석을 남기지 않아 차후에 다른 사람이 너무 커서 폰트를 줄였다. 이는 의도를 작성하지 않아서 이다.
			

	


