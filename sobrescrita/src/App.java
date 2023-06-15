class Linguagem {
    public void showInfo(){
        System.out.println("Portuguese language");
    }
}

class Java extends Linguagem {
    public void showInfo(){
        System.out.println("Java language");
    }
}

public class App {
    public static void main(String[] args) {
        Java j1 = new Java();

        Linguagem l1 = new Linguagem();

        j1.showInfo();
        l1.showInfo();
    }
}