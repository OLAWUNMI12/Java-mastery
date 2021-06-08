public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
        add(new ComplexNumber(0, 0));
    }

    public void add(ComplexNumber complexNumber){
        this.real = this.real + complexNumber.getReal();
        this.imaginary = this.imaginary + complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
        subtract(new ComplexNumber(0, 0));
    }

    public void subtract(ComplexNumber complexNumber){
        this.real = this.real - complexNumber.getReal();
        this.imaginary = this.imaginary - complexNumber.getImaginary();
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1 ,1);
        ComplexNumber complexNumber2 = new ComplexNumber(2.5 ,-1.5);
        complexNumber.add(1,1);
        System.out.println(complexNumber.real + "  " +complexNumber.getImaginary());
        complexNumber.subtract(complexNumber2);
        System.out.println(complexNumber.real + "  " +complexNumber.getImaginary());

    }
}
