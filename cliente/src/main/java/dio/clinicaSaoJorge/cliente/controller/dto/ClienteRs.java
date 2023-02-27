package dio.clinicaSaoJorge.cliente.controller.dto;

import dio.clinicaSaoJorge.cliente.model.Clientes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class ClienteRs {

    private Long id;
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String genero;
    private String convenio;
    private String endereco;
    private String telefone;

    public static ClienteRs converter(Clientes c) {
        var cliente = new ClienteRs();

        cliente.setId(c.getId());
        cliente.setNome(c.getNome());
        cliente.setCpf(c.getCpf());
        cliente.setDataDeNascimento(c.getDataDeNascimento());
        cliente.setGenero(c.getGenero());
        cliente.setConvenio(c.getConvenio());
        cliente.setEndereco(c.getEndereco());
        cliente.setTelefone(c.getTelefone());

        return cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
