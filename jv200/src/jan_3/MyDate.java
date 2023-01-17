package jan_3;



	public class MyDate {
		private int day;
		private int month;
		private int year;
		
		int a = 10;
		public int b = 20;
		private int c;
		
		// 디폴트 생성자의 모습
		public MyDate() {
			
		}
		public MyDate(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public int getDay() {
			return day;
		}
		public int getMonth() {
			return month;
		}
		public int getYear() {
			return year;
		}
		public void setDay(int d) {
			this.day = d;
		}
		public void setMonth(int m) {
			month = m;
		}
		public void setYear(int y) {
			year = y;
		}
		public String getDetails() {
			return year + "-" + month + "-" + day;
		}
	}

