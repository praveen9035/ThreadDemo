package com.cg.thread;


class Source{
	
	String[] names= {"abc","xyz","pqr"};	
	}

class A implements Runnable
{
Source source;
Thread t;
A()
{
	t=new Thread(this,"ONE");
	t.setPriority(2);
	t.start();
}
@Override
public void run() {
	source=new Source();
	
	for(int i=0; i<source.names.length; i++)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName() + " "+t.getPriority()+ " "+"prinitng"+source.names[i]);
	}
	
}
}
public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
//default thread is main thread
		//5  1-10
		
		Source source=new Source();
		Runnable a=new A();
		
 for(int i=0; i<source.names.length; i++)
 {
	 //Thread.sleep(1000);
	 System.out.println(Thread.currentThread() + " "+"printing"+source.names[i]);
 }
		
	}

}

