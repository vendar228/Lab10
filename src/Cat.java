public class Cat extends Animal {
    @Override
    public void бежать(double дистанция) {
        if ((дистанция>0)) {
            System.out.println("true");
            System.out.println("false");
        }
    }
    @Override
    public void плыть(double метры) {
        if ((метры>0)) {
            System.out.println("true");
            System.out.println("false");
        }
    }
    @Override
    public void прыгать(double высота) {
        if ((высота>0)) {
            System.out.println("true");
            System.out.println("false");
        }
    }
}