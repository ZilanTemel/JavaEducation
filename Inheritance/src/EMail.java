public class EMail extends Document {
    private String subject;
    public String[] to;
    private int recipientCount;


    public EMail() {
        super();
        this.subject = " ";
        this.to = new String[10];
        this.recipientCount = 0;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String[] getTo() {
        return to;
    }

    public void addRecipient(String recipient) {
        if (recipientCount < to.length) {
            to[recipientCount] = recipient;
            recipientCount++;
        } else {
            System.out.println("Recipient list is full!");
        }
    }


    public void printRecipients() {
        System.out.println("Recepients:");
        for (String recipient : to) {
            if (recipient != null) {
                System.out.println(recipient);
            }
        }
    }

    public void printEmailDetails() {
    }
}
