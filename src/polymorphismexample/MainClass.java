package polymorphismexample;

public class MainClass {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();

        sampleClass.sum(23,34);
        sampleClass.sum(33,12,24);
        sampleClass.sum(34.56,56.66);
        sampleClass.sum(12.34f,4.56f);
    }
}
