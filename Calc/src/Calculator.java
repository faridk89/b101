public class Calculator {

    double num1;
    double num2;

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return this.num2+this.num1;
    }
    public double multiply(){
        return this.num2*this.num1;
    }
    public double subtract(){
        return this.num2-this.num1;
    }
    public double divide(){
        return this.num2/this.num1;
    }
}
