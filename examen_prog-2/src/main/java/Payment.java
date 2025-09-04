import java.time.LocalDateTime;

public class Payment {
    private int id;
    private double montant;
    private LocalDateTime date;

    public Payment(int id, double amount, LocalDateTime dateTime) {
        this.id = id;
        this.montant = amount;
        this.date = dateTime;
    }

    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getMntant() {
        return montant;
    }


}
