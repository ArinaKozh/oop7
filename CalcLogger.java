public class CalcLogger implements Calculable{

    private Calculable calculable;
    private Loggable loggable;

    public CalcLogger(Calculable calculable, Loggable loggable) {
        this.calculable = calculable;
        this.loggable = loggable;
        loggable.log("Число "+ calculable.getResult().toString()+"\n");
    }

    @Override
    public Calculable sum(ComplexNumber CN) {
        loggable.log("Прибавляем " +CN.toString()+"\n");
        return calculable.sum(CN);
    }

    @Override
    public Calculable multi(ComplexNumber CN) {
        loggable.log("Умножаем на "+CN.toString()+"\n");
        return calculable.multi(CN);
    }


    @Override
    public ComplexNumber getResult() {
        ComplexNumber res = calculable.getResult();
        loggable.log("Получили результат: "+ res.toString()+"\n");
        return res;
    }

}