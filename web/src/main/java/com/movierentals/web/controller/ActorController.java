package com.movierentals.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActorController {
    //@Autowired
    //private ClientService clientService;

   // @Autowired
  //  private ClientConverter clientConverter;

//    @RequestMapping(value = "/clients")
//    List<ClientDto> getAllClients() {
//
//        return new ArrayList<>(
//                clientConverter.convertModelsToDtos(
//                        clientService.getAllClients()));
//    }

//    @RequestMapping(value = "/clients", method = RequestMethod.POST)
//    ClientDto addClient(@RequestBody ClientDto clientDto) {
//        var client = clientConverter.convertDtoToModel(clientDto);
//
//        var result = clientService.saveClient(client.getName(), client.getAddress());
//
//        var resultModel = clientConverter.convertModelToDto(result);
//
//        return resultModel;
//    }

//    @RequestMapping(value = "/clients/{id}", method = RequestMethod.PUT)
//    ClientDto updateClient(@PathVariable Long id, @RequestBody ClientDto clientDto) {
//        clientDto.setId(id);
//        Client client = clientConverter.convertDtoToModel(clientDto);
//        return
//                clientConverter.convertModelToDto(
//                        clientService.updateClient(
//                                client.getId(), client.getName(), client.getAddress()
//                        ));
//    }

//    @RequestMapping(value = "/clients/{id}", method = RequestMethod.DELETE)
//    ResponseEntity<?> deleteClient(@PathVariable Long id) {
//        clientService.deleteClient(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
