public class Example {

        int i = 1;
        public void firstMethod() {
            int i = 4, j = 5;
            this.i = i + j;
            System.out.println("this.i: " + this.i); //4 + 5 = 9
            secondMethod(7);
            System.out.println("int i: " + i); //4
            System.out.println("this.i: " + this.i); //7 + 8 = 15
        }
        public void secondMethod(int i) {
            System.out.println("secondMethod(int i): " + i); // 7
            int j = 8;
            this.i = i + j; //7 + 8 = 15
        }

        public static void main(String[] args) {
            Example object = new Example();
            object.firstMethod();
        }
    }


/*
public class ScopeExample {
    int i = 1;
    public void firstMethod() {
        int i = 4, j = 5;
        this.i = i + j;
        System.out.println("this.i: " + this.i); //4 + 5 = 9
        secondMethod(7);
        System.out.println("int i: " + i); //4
        System.out.println("this.i: " + this.i); //7 + 8 = 15
    }
    public void secondMethod(int i) {
        System.out.println("secondMethod(int i): " + i); // 7
        int j = 8;
        this.i = i + j; //7 + 8 = 15
    }

    public static void main(String[] args) {
        ScopeExample object = new ScopeExample();
        object.firstMethod();
    }
}
 */
