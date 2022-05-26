package corejava_package;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vol v = new Vol();
		v.volume(5);
		v.volume(4.5f,5.3f,6.8f);
		v.volume(5.5f);
	}

}
class Vol
{
	void volume(int s)
	{
		System.out.println("The volume of a cube is: "+s*s*s);
	}
	void volume(float l,float b,float h)
	{
		System.out.println("The volume of a cuboid is: "+l*b*h);
	}
	void volume(float r)
	{
		System.out.println("The volume of a sphere is: "+(4/3)*3.14*r*r*r);
	}
}