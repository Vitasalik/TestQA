public class Main {
    public  static void main(String[] args) {
        var tm = new Print();

        tm.PrintText("Hi");
        tm.PrintInt(865);
    }

    public static class Print{

        public void PrintText(String text){
            System.out.println(text);
        }

        public void PrintInt(int text){
            System.out.println(text);
        }
    }
}