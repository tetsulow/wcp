public class Lesson05 {
	public static void main(String[] args) {
			introduceOneself();
			String title = "至急確認";
			String address = "test@1234";
			String text = "明日提出の書類の確認をお願いします";
//			email (title, address, text);
	}

	public static void introduceOneself() {
		String name = "Tetsuya";
		int age = 27;
		double height = 168.2;
		char zodiac = '戌';
		System.out.println("私の名前は" + name + "です。");
		System.out.println("歳は" + age + "です。");
		System.out.println("身長は" + height + "です。");
		System.out.println("干支は" + zodiac + "です。");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}