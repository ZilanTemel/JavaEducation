import java.io.*;

class FileOperation {

    public static void main(String[] args) throws IOException {
        // Dosya nesnesi oluşturma
        File file = new File("cod.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        String val = "Coding time!";

        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(val);
        bWriter.write("\nJava classes");
        bWriter.close();

        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line;

        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
        bReader.close();
    }
}
