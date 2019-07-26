/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;


public class PrecoDAO extends GenericDAO{
    
    public List listarPorCafe(Class classe,int codCafe) throws SQLException {
        List lista = new ArrayList();
        Session sessao = dao.ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();
        
        Criteria consulta = sessao.createCriteria( classe );
        consulta.setResultTransformer( Criteria.DISTINCT_ROOT_ENTITY  );
        // 2) ASSOCIAÇÕES
        consulta.createAlias("tipoCafe", "c");      
        // 3) CRITERIOS de pesquisa    
        consulta.add( Restrictions.eq("c.cod", codCafe ) );
            
        lista = consulta.list();
        
        sessao.getTransaction().commit();
        sessao.close();
        return lista;        
    }
    
}
