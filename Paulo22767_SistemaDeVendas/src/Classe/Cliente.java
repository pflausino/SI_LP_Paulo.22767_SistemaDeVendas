package Classe;

/**
 *
 * @author Pflausino
 */
public class Cliente {
    
    private int codigoClient;
    private String nameClient;
    private String cpfCliente;
    private String dateBirthday;

    
    
    //Get
    public int getCodigoClient() {
        return codigoClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }
    
    //Set
    public void setCodigoClient(int codigoClient) {
        this.codigoClient = codigoClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }
    
    
}
