
package Classe;

/**
 *
 * @author Pflausino
 */
public class Produto {

    private int codigoProduct;
    private String nameProduct;
    private Double priceBuy;
    private Double priceSell;
    private int qntProduct;
    
    
    //GET

    public int getCodigoProduct() {
        return codigoProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public Double getPriceBuy() {
        return priceBuy;
    }

    public Double getPriceSell() {
        return priceSell;
    }

    public int getQntProduct() {
        return qntProduct;
    }
    
    //SET

    public void setCodigoProduct(int codigoProduct) {
        this.codigoProduct = codigoProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceBuy(Double priceBuy) {
        this.priceBuy = priceBuy;
    }

    public void setPriceSell(Double priceSell) {
        this.priceSell = priceSell;
    }

    public void setQntProduct(int qntProduct) {
        this.qntProduct = qntProduct;
    }
    
    
            
}
