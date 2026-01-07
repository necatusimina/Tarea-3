package cuentas;

/**
 * Defines a basic bank account entity.
 * <p>
 * It exposes operations to read the balance, add funds (deposit) and remove funds (withdraw),
 * applying simple validation rules.
 * </p>
 */
public class CCuenta {

    /** Full name of the account holder. */
    private String nombre;

    /** Account code/identifier used to reference this account. */
    private String cuenta;

    /** Available amount of money in the account. */
    private double saldo;

    /** Interest rate associated with the account (if applicable). */
    private double tipoInterés;

    /**
     * Builds a blank account instance.
     */
    public CCuenta() {
        // No default initialization needed.
    }

    /**
     * Builds an account with the provided initial values.
     *
     * @param nom  holder full name
     * @param cue  account identifier
     * @param sal  starting balance
     * @param tipo interest rate value
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Reads the current account balance.
     *
     * @return current balance value
     */
    public double estado() {
        return saldo;
    }

    /**
     * Adds money to the account.
     *
     * @param cantidad deposit amount
     * @throws Exception when {@code cantidad} is negative
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Removes money from the account.
     *
     * @param cantidad withdrawal amount
     * @throws Exception when {@code cantidad} is not positive or balance is insufficient
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Gets the holder name.
     *
     * @return holder name
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the holder name.
     *
     * @param nombre new holder name
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the account identifier.
     *
     * @return account identifier
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the account identifier.
     *
     * @param cuenta new account identifier
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Gets the current balance.
     *
     * @return balance
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets the balance value.
     *
     * @param saldo new balance
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Gets the interest rate.
     *
     * @return interest rate
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Sets the interest rate.
     *
     * @param tipoInterés new interest rate
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
