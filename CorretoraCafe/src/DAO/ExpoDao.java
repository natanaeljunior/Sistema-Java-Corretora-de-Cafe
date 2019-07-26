/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Modelo.Exportador;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author 2016122760350
 */
public class ExpoDao  extends GenericDAO{
      public ExpoDao()  {
           
    }
      
      
    public List<Exportador>pesquisar(int tipo, String pesq) throws SQLException {
              
        List<Exportador> lista = new ArrayList();
        Session sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();
        
        Criteria consulta = sessao.createCriteria( Exportador.class );
        
        switch ( tipo ) {
           
            case 1: consulta.add( Restrictions.like("razaoSocial", pesq + "%") );
                    break;
            case 2: consulta.add( Restrictions.like("cnpj", pesq + "%") );
                    break;                    
        }
        
        lista = consulta.list();
        
        sessao.getTransaction().commit();
        sessao.close();
        return lista;               
    } 

}
