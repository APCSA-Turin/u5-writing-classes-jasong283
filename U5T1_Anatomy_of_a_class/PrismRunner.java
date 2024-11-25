package U5T1_Anatomy_of_a_class;

public class PrismRunner {
    public static void main(String[]args) {
        Prism prism = new Prism(5, 6, 10);
        System.out.println(prism.dimensions());     
        System.out.println();
        
        // test volume and surfaceArea methods 
        int vol = prism.volume();
        int surfaceArea = prism.surfaceArea();
        System.out.println(vol);
        System.out.println(surfaceArea);
        System.out.println();
        
        // test setter methods
        prism.setLength(8);
        prism.setWidth(15);
        prism.setHeight(20);
        System.out.println(prism.dimensions());
        System.out.println();
        
        // retest volume and surfaceArea methods after setting new dimensions
        vol = prism.volume();
        surfaceArea = prism.surfaceArea();
        System.out.println(vol);
        System.out.println(surfaceArea);
    }
}
