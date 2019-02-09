package pra_2019_02_10;
/*
//クラスplayerの部分
public class Main extends player{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.play("~~~を再生する。");
		m.pause();
		m.stop();
	}

	@Override
	void play(String songName) {
				
		System.out.println(songName + "を再生する");
	}

	@Override
	void pause() {
		System.out.println("pause部分");
	}

	@Override
	void stop() {
		System.out.println("stop部分");
	}

}
*/
//Animal,Dog,Cat部分
public class Main {
	
	public static void main(String[] args)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		d.crying();
		c.crying();
	}
}
