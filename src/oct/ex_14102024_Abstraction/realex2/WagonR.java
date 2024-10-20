package oct.ex_14102024_Abstraction.realex2;

public class WagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("stopping car");
    }
}
