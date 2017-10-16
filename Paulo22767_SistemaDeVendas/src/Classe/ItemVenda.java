
package Classe;

/**
 *
 * @author Pflausino
 */
public class ItemVenda {
    
        private int codigoItem;
    private int quantidadeItem;
    private double priceItem;
    
    //GET

    public int getCodigoItem() {
        return codigoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public double getPriceItem() {
        return priceItem;
    }
    
    //SET

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }
    
}
