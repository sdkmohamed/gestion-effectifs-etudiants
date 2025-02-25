package com.example.gestioneffectifs.controller;

import com.example.gestioneffectifs.entity.Etudiant;
import com.example.gestioneffectifs.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")  // ✅ Mapping des routes API
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;

    // ✅ Récupérer tous les étudiants
    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    // ✅ Récupérer un étudiant par ID
    @GetMapping("/{id}")
    public Optional<Etudiant> getEtudiantById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    }

    // ✅ Ajouter un étudiant
    @PostMapping
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
}
