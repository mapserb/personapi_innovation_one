package one.innovation.personapi.controllers;

import lombok.AllArgsConstructor;
/*
import one.innovation.personapi.dto.request.PersonDTO;
import one.innovation.personapi.dto.response.MessageResponseDTO;
import one.innovation.personapi.exception.PersonNotFoundException;
import one.innovation.personapi.services.PersonService;
import javax.validation.Valid;
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController //* pto de entrada no projeto / controlador de API REST
@RequestMapping("/api/v1/people") //* uri de acesso principal do proj
//* @AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    @GetMapping //* operacao REST do tipo get
    public String getBook() {
        return "API test";
    }


/*
    private final PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return personService.update(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }

*/
}
