import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Frais {
    private int id;
    private double montant;
    private LocalDateTime deadline;
    private Etudiant etudiant;
    private List<Payment> payments = new ArrayList<>();
    private Statut statut = Statut.UNPAYD;

    public Frais(int id, double amount, LocalDateTime deadline, Etudiant student) {
        this.id = id;
        this.montant = amount;
        this.deadline = deadline;
        this.etudiant = etudiant;
    }

    public void ajouterPayment(Payment payment) {
        payments.add(payment);
    }

    public void getStatus(Instant instant) {
        double totalPaid = payments.stream().mapToDouble(Payment::getMontant).sum();
        LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        if (totalPaid == 0) {
            return;
        } else if (totalPaid > montant) {
            statut = Statut.OVERPAID;
        } else if (totalPaid == montant) {
            statut =  Statut.PAID;
        } else if (now.isBefore(deadline)) {
            statut = Statut.IN_PROGRESS;
        }
        return;

    }

    public int getId() {
        return id;
    }


    public double getMontant() {
        return montant;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public List<Payment> getPayments() {
        return new ArrayList<>(payments);
    }

    public Statut getStatut() {
        return statut;
    }
}
