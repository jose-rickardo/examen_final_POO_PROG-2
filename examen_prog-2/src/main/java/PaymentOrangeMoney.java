import java.time.LocalDateTime;

public class PaymentOrangeMoney extends Payment{
    String nomDuCompte;
    String codeMarcand;

    public PaymentOrangeMoney(int id, double amount, LocalDateTime dateTime, String nomDuCompte, String codeMarcand) {
        super(id, amount, dateTime);
        this.nomDuCompte = nomDuCompte;
        this.codeMarcand = codeMarcand;
    }
}
