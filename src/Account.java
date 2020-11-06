public class Account <A extends Number> implements Accounttable {

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
    public void print(Object year) {
        System.out.println("Id" + " " + getId() + "\nSum" + " " + getSum() + "\nCode" + " " + year);
    }
}
