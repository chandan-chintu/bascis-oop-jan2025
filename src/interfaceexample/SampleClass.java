package interfaceexample;

public class SampleClass implements SampleInterface{

    @Override
    public void demo() {
        System.out.println("demo method body inside sampleclass");
        System.out.println("abc value is : "+SampleInterface.abc);
    }
    //extra lines
    //sme lines

    @Override
    public void demo2() {
        System.out.println("demo2 method body inside sampleclass");
        System.out.println("xyz value is : "+SampleInterface.xyz);
    }
}
