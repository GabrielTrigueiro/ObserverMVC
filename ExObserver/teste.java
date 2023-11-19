package ExObserver;

public class teste {
  public static void main(String[] args) {
    NewsAgency observable = new NewsAgency();
    NewsChannel observer = new NewsChannel();
    NewsChannel observer2 = new NewsChannel();

    observable.addObserver(observer);
    observable.setNews("news");

    // assertEquals(observer.getNews(), "news");
    System.out.println((observer2.getNews() + "news"));
  }
}
