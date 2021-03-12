package day12lab;

public class ThreadDemo {

  public static void main(String[] args) {
    Thread t = new Thread(new MyThreadJob());
    t.start();

    for (int i = 1; i < 6; i++) {
      System.out.println("line " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

class MyThreadJob implements Runnable {

  @Override
  public void run() {
    System.out.println("Thread job started...");
  }
}
