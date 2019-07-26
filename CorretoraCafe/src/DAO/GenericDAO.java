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


public class GenericDAO {
    
    public GenericDAO()  {
            
    }
    
    public void inserir(Object obj) {
        Session sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();
        
        sessao.save(obj);
        
        sessao.getTransaction().commit();
        
        sessao.close();        
    }
    
    
    public void alterar(Object obj) throws ClassNotFoundException, SQLException {      
        Session sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();
        
        sessao.update(obj);
        
        sessao.getTransaction().commit();
        sessao.close();                 
    }
    
    public void excluir(Object obj) throws SQLException {
        
        Session sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();
        
        sessao.delete(obj);
        
        sessao.getTransaction().commit();
        sessao.close(); 

    }

    public List listar(Class classe) throws SQLException {
        List lista = new ArrayList();
        Session sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();
        
        Criteria consulta = sessao.createCriteria( classe );
        lista = consulta.list();
         
        sessao.getTransaction().commit();
        sessao.close();
        return lista;        
    }
    
    
}
