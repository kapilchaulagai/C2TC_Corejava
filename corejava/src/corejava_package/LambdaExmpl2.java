package corejava_package;
interface Runnable
{
	public void run(int speed);
}
public class LambdaExmpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = 100;
		Runnable r = (speed)->
		{
			return speed;
		};
		r.run(speed);
	}

}
