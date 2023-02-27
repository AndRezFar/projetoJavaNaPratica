package dio.clinicaSaoJorge.cliente.model;

public class Endereco {
    private String cep;
    private String logradouto;
    private String cidade;
    private String Estado;

    public Endereco(String cep, String logradouto, String cidade, String estado) {
        this.cep = cep;
        this.logradouto = logradouto;
        this.cidade = cidade;
        Estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouto() {
        return logradouto;
    }

    public void setLogradouto(String logradouto) {
        this.logradouto = logradouto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouto='" + logradouto + '\'' +
                ", cidade='" + cidade + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }


}
