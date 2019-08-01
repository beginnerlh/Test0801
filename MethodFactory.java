package factory.method_factory;

//工厂方法模式
public class MethodFactory {
    public static void main(String[] args) {
        MethodFactory methodFactory = new MethodFactory();
        ComputerFactory factory = new LenovoFactory();
        methodFactory.buyComputer(factory.creatComputer());
    }

    public static void buyComputer(MethodComputer methodComputer){
        methodComputer.printComputer();;
    }

}

interface MethodComputer{
    void printComputer();
}



class Dell implements MethodComputer{

    @Override
    public void printComputer() {
        System.out.println("Buy Dell");
    }
}

class Lenovo implements MethodComputer{

    @Override
    public void printComputer() {
        System.out.println("Buy Lenovo");
    }
}

interface ComputerFactory{
    MethodComputer creatComputer();
}

class DellFactory implements ComputerFactory{

    @Override
    public MethodComputer creatComputer() {
        return new Dell();
    }
}

class LenovoFactory implements ComputerFactory{

    @Override
    public MethodComputer creatComputer() {
        return new Lenovo();
    }
}


