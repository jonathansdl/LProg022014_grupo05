
package RegistrarVendas;


public class Vendasbin {
   
   private String id;
    
   private String cpf;

   private String precovenda;
   
   private String produto;
   
   private String quantidade;
   
   private String valor;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the precovenda
     */
    public String getPrecovenda() {
        return precovenda;
    }

    /**
     * @param precovenda the precovenda to set
     */
    public void setPrecovenda(String precovenda) {
        this.precovenda = precovenda;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

}
