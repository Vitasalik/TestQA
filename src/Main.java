public class Main {
    public  static void main(String[] args) {
        var tm = new Print();

        tm.PrintText("Hi");
    }

    public static class Print{

        public void PrintText(String text){
            System.out.println(text);
        }
    }
}