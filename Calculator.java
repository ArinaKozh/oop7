public final class Calculator implements Calculable {

    private ComplexNumber primaryCN;

    public Calculator(ComplexNumber primaryCN) {
        this.primaryCN = primaryCN;
    }

    @Override
    public Calculable sum(ComplexNumber CN) {
        primaryCN.Im += CN.Im;
        primaryCN.Re += CN.Re;
        return this;
    }

    @Override
    public Calculable multi(ComplexNumber CN) {
        int b = this.primaryCN.Im*CN.Re+this.primaryCN.Re*CN.Im;
        int a = this.primaryCN.Re*CN.Re-this.primaryCN.Im*CN.Im;
        this.primaryCN.Re = a;
        this.primaryCN.Im = b;
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryCN;
    }
}