
public class FourDotSixteen 
{
	public static void main(String[] args)
	{
		float time = 0f;
		float height = 800f;
		float speed = 0f;
		
		while (height > 0)
		{
			height -= speed;
			speed += 1.5f;
			time ++;
		}
		
		System.out.print(time + " v: " + speed);
	}
}
