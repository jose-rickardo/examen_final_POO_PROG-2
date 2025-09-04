import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

public class Statistique {
    public List<Frais> getLateFees(List<Frais> fees, Instant t) {
        return fees.stream()
                .filter(frais -> frais.getStatut() == Statut.LATE)
                .collect(Collectors.toList());
    }
    public double getTotalMissingFees(List<Frais> fees, Instant t) {
        return getLateFees(fees, t).stream()
                .mapToDouble(frais -> frais.getMontant() - frais.getPayments().stream().mapToDouble(Payment::getMontant).sum())
                .sum();
    }
    public double getTotalPaidByStudent(Etudiant etudiant, List<Frais> fees, Instant t) {
        return fees.stream()
                .filter(frais -> frais.getEtudiant().getId() == etudiant.getId())
                .flatMap(fee -> fee.getPayments().stream())
                .mapToDouble(Payment::getMntant)
                .sum();
    }

}
