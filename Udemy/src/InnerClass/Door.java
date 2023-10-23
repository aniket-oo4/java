package InnerClass;

public class Door {
private Lock obj;
public Door()
{
	obj=new Lock(true);
}
class Lock{
	private boolean lock;
	public  Lock(boolean l) {
		this.lock=l;
	}
	public boolean isLock()
	{
		return lock;
	}
	public void setLock(boolean lock)
	{
		this.lock=lock;
	}
}
}
