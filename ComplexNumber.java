public class ComplexNumber{
    public int Re;
    public int Im;

    public ComplexNumber(int Re, int Im){
        this.Re = Re;
        this.Im = Im;
    }
    @Override
    public String toString() {
        return String.format("%d + i*%1d", this.Re,this.Im);
    }



}