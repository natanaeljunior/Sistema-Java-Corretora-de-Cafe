/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Modelo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author junior
 */
public class UsuarioDAO  extends GenericDAO{
    
    public List<Usuario> buscaUser(String pesq) throws SQLException {
              
        List<Usuario> lista = new ArrayList();
        Session sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();
        
        Criteria consulta = sessao.createCriteria( Usuario.class );
        consulta.add( Restrictions.like("nome", pesq + "%") );
        
        lista = consulta.list();
        
        sessao.getTransaction().commit();
        sessao.close();
        return lista;               
    }
    
}
