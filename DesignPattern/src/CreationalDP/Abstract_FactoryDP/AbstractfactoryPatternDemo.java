package CreationalDP.Abstract_FactoryDP;

public class AbstractfactoryPatternDemo {
    public static void main(String[] args) {
        //!!!Sekil fabrikası cagrılıyor
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SEKIL");

        Shape shape1 = shapeFactory.getShape("DAIRE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("DIKDORTGEN");
        shape2.draw();

        //!!! Renk fabrikası cagrılıyor
        AbstractFactory colorFactory = FactoryProducer.getFactory("RENK");

        Color color1 = colorFactory.getColor("KIRMIZI");
        color1.fil();
        Color color2 = colorFactory.getColor("MAVI");
        color2.fil();
    }
}
