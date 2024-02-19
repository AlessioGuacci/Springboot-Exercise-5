package com.develope.exercise5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class NameController {
        @GetMapping("name")
        public String printName(@RequestParam String nome){
            return "Nome: " + nome;
        }
        @PostMapping("/nameReversed")
        public String printNameReversed(@RequestParam String nome){
            StringBuilder nameReversed = new StringBuilder(nome).reverse();
            return "Il nome al contrario è " + nameReversed.toString();
        }

}
