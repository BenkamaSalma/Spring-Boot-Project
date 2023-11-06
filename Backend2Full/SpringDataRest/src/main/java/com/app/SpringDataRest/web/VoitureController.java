package com.app.SpringDataRest.web;

import com.app.SpringDataRest.Modele.Voiture;
import com.app.SpringDataRest.Modele.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class VoitureController {
    @Autowired
    private VoitureRepo voitureRepo;
    @RequestMapping("/voitures")
    public Iterable<Voiture> getVoitures(){

        return voitureRepo.findAll();
    }
    @RequestMapping(value = "/voitures", method = RequestMethod.POST)
    public Voiture addVoiture(@RequestBody Voiture newVoiture) {
        return voitureRepo.save(newVoiture);
    }
    @DeleteMapping("/voitures/{id}")
    public void deleteVoiture(@PathVariable Long id) {
        voitureRepo.deleteById(id);
    }
}
