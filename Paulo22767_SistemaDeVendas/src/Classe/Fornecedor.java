package Classe;

/**
 *
 * @author Pflausino
 */
public class Fornecedor {
    
    private int codigoFornecedor;
    private String nameFornecedor;
    private String cnpjFornecedor;
    
    
    public Fornecedor(int codigoFornecedor, String nameFornecedor, String cnpjFornecedor) {
    this.codigoFornecedor = codigoFornecedor;
    this.nameFornecedor = nameFornecedor;
    this.cnpjFornecedor = cnpjFornecedor;
    }

    public Fornecedor() {
    }
    //GET

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public String getNameFornecedor() {
        return nameFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }
    
    //SET
    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public void setNameFornecedor(String nameFornecedor) {
        this.nameFornecedor = nameFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }
    
}
