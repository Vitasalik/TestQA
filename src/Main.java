public class Main {
    public  static void main(String[] args) {
        var tm = new Print();

        tm.PrintText("Hi");
        tm.DoublePrint("Здарова");
    }

    public static class Print{

        public void PrintText(String text){
            System.out.println(text);
        }

        public void PrintInt(int text){
            System.out.println(text);
        }

        public void DoublePrint(String text){
            PrintText(text);
            PrintText(text);
        }
    }
}