/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Libro;


/**
 *
 * @author Nathaly
 */
public class LibroServicio {
    
      public void guardarLibro(long isbn, String titulo, Integer anio, Integer ejemplares, Integer prestados) {
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        em.getTransaction().begin();

        Libro libro = new Libro();
        
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setPrestados(prestados);
        
        em.persist(libro);

        em.getTransaction().commit();

    }
    
    
    public Libro buscarLibroPorIsbn(long isbn) {
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        Libro libro = em.find(Libro.class,isbn);

        return libro;

    }
    
}
