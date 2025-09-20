public class OuterClass {
    
    static class StaticNestedClass {
        public void printMessage() {
            System.out.println("Hello from the static nested class");
        }
    }
 
    class InnerClass {
        public void printMessage() {
            System.out.println("Hello from the inner class");
        }
    }
 
    public void displayLocalClassMessage() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }
 
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printMessage();
    }
 
    public static void main(String[] args) {
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.printMessage();
 
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printMessage();
 
        outerClass.displayLocalClassMessage();
    }
}