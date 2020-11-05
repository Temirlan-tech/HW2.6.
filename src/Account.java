public class Account<A> extends Number implements Accounttable {

    private A id;
    private int sum;

    public Account(A id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public A getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Id" + " " + getId() + "\nSum" + getSum());
    }
}
