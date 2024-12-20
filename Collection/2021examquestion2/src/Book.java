
class Book implements Comparable<Book> {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double totalPrice() {
        return price + price * 0.08;
    }

    @Override
    public String toString() {
        return name + " " + (int) totalPrice();
    }

    @Override
    public int compareTo(Book o) {
        return (int) (this.totalPrice() - o.totalPrice());
    }
}