package dio.clinicaSaoJorge.cliente.controller;

import dio.clinicaSaoJorge.cliente.controller.dto.ClienteRs;
import dio.clinicaSaoJorge.cliente.model.Clientes;
import dio.clinicaSaoJorge.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @GetMapping
    public List<ClienteRs> findAll(){
        var cliente = clienteRepository.findAll();
        return cliente.stream().map(ClienteRs::converter).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ClienteRs findbyId(@PathVariable("id") Long id){
        var getIdCleinte = clienteRepository.getById(id);
        return ClienteRs.converter(getIdCleinte);
    }

    @PostMapping
    public void saveCliente(@RequestBody ClienteRs cliente){
        var postCliente = new Clientes();
        postCliente.setNome(cliente.getNome());
        postCliente.setCpf(cliente.getCpf());
        postCliente.setDataDeNascimento(cliente.getDataDeNascimento());
        postCliente.setGenero(cliente.getGenero());
        postCliente.setConvenio(cliente.getConvenio());
        postCliente.setEndereco(cliente.getEndereco());
        postCliente.setTelefone(cliente.getTelefone());
        clienteRepository.save(postCliente);
    }

    @PutMapping("/{id}")
    public void updateCliente(@PathVariable Long id, @RequestBody ClienteRs cliente) throws Exception{
        var putCliente = clienteRepository.findById(id);
        if(putCliente.isPresent()){
            var updateCliente = putCliente.get();
            updateCliente.setNome(cliente.getNome());
            updateCliente.setCpf(cliente.getCpf());
            updateCliente.setDataDeNascimento(cliente.getDataDeNascimento());
            updateCliente.setGenero(cliente.getGenero());
            updateCliente.setConvenio(cliente.getConvenio());
            updateCliente.setEndereco(cliente.getEndereco());
            updateCliente.setTelefone(cliente.getTelefone());
            clienteRepository.save(updateCliente);
        }else {throw new Exception("Essa pessoa não possui cadastro");}
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id, @RequestBody ClienteRs cliente) throws Exception{
        var putCliente = clienteRepository.findById(id);
        if(putCliente.isPresent()){
            clienteRepository.deleteById(id);
        }else {throw new Exception("Essa pessoa não possui cadastro");}
    }


}
