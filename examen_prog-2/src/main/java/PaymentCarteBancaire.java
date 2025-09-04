import java.time.LocalDateTime;

public class PaymentCarteBancaire extends Payment{
    String numeroDeLaCarte;
    String compteRecaveur = "HEI MADAGASCAR";
    public PaymentCarteBancaire(int id, double amount, LocalDateTime dateTime, String numeroDeLaCarte, String compteRecaveur ) {
        super(id, amount, dateTime);
        this.numeroDeLaCarte = numeroDeLaCarte;
        this.compteRecaveur = compteRecaveur;
    }
}
