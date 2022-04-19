package com.ahmed.produits;

//import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ahmed.produits.entities.Produit;
import com.ahmed.produits.service.ProduitService;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {
@Autowired
ProduitService produitService;

@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;

public static void main(String[] args) {
SpringApplication.run(ProduitsApplication.class, args);
}


@Override
public void run(String... args) throws Exception {
/*	
produitService.saveProduit(new Produit("Clavier MSI", 260.0, new Date()));
produitService.saveProduit(new Produit("IPAD Apple", 4500.0, new Date()));
produitService.saveProduit(new Produit("Imprimante Thomson", 900.0, new Date()));*/
repositoryRestConfiguration.exposeIdsFor(Produit.class);
}
}