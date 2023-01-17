package jan_5;

public class ReferenceArray {
	public static void main(String[] args) {
		Point[] points;
		points = new Point[3];
		points[0] = new Point(0, 1);
		points[1] = new Point(2, 3);
		points[2] = new Point(4, 5);

		Point[] points2 = new Point[] {new Point(0,1),new Point(2, 3),new Point(4, 5) };
	
		for(int i = 0 ; i < points.length; i++) {
			System.out.println("[" + i + "] = " + points[i]); 
			//points[i].toString()이 생략된것이다.
			//찍히는게 [0,1]이라고 해서 배열을 형식으로 불러온것이 아니라 toString()의 지정된 텍스트를 불러왔을 뿐이다
			
			System.out.println("[" + i + "] = " + (points[i] == points2[i]));
		}
	}
}
