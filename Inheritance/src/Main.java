public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.addAuthor("John Doe");
        doc.addAuthor("Jane Smith");

        // Yazarları yazdırmak için:
        for (String author : doc.getAuthors()) {
            if (author != null) {
                System.out.println(author);
            }
        }
    }
}
