package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import libreria.entidades.Cliente;

public class ClienteServicio {

    public void guardarCliente(long documento, String nombre, String apellido, String domicilio, String teléfono) {
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        em.getTransaction().begin();

        Cliente cliente = new Cliente();

        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDomicilio(domicilio);
        cliente.setTeléfono(teléfono);

        em.persist(cliente);

        em.getTransaction().commit();

    }

    public void modificarCliente(Long documento, String nombre, String apellido, String domicilio, String teléfono) throws Exception {

        if (documento == null || documento == 0) {
            throw new Exception("El documento ingresado no es valido");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre ingresado no es valido");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new Exception("El apellido ingresado no es valido");
        }
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        em.getTransaction().begin();

        //Cliente cliente=buscarClientePorNombre(nombre);
        Cliente cliente = em.find(Cliente.class, documento);
        if (cliente == null) {
            throw new Exception("EL cliente ingresado no es valido");
        }
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDomicilio(domicilio);
        cliente.setTeléfono(teléfono);
        em.merge(cliente);
        em.getTransaction().commit();
    }

    public void eliminar(Long documento) throws Exception {

        if (documento == null || documento == 0) {
            throw new Exception("El documento ingresado no es valido");
        }
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        em.getTransaction().begin();

        Cliente cliente = em.find(Cliente.class, documento);
        if (cliente == null) {
            throw new Exception("EL cliente ingresado no es valido");
        }

        em.remove(cliente);
        em.getTransaction().commit();

    }

    public Cliente buscarClientePorNombre(String nombre) {
        EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
        Cliente cliente = (Cliente) em.createQuery("Select c FROM Cliente c Where c.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%")
                .getSingleResult();

        return cliente;

    }
}
