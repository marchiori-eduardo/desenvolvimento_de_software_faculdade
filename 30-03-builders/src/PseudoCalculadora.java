public class PseudoCalculadora {
    private Integer num1;
    private Integer num2;

    public PseudoCalculadora() {
    }
    public PseudoCalculadora(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public int soma(){
        return num1 + num2;
    }
    public int subtracao(){
        return num1 - num2;
    }
    public int divisao(){
        return num1 / num2;
    }
    public int multiplicacao(){
        return num1 * num2;
    }

}
