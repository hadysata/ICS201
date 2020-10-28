public class Test {
    public static void main(String[] args) {
      java.util.Date x = new java.util.Date();
      java.util.Date y = (java.util.Date)x.clone();
      System.out.println(x = y);
    }
  }