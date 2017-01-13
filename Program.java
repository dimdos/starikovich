public class Program
{
	public static void main(String[] args)
	{
		Program program = new Program();
			program.start();
	}
	public void start()
	{
		MyReader reader = new MyReader();
		int a = reader.read();
		int b = reader.read();
		MyWorker worker = new MyWorker();
		worker.calcSum (a, b);
		System.out.println(worker.getResult());
	}
}
