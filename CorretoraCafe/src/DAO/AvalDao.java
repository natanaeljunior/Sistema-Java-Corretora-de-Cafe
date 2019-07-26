/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modelo.Avaliacao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AvalDao extends GenericDAO {

    public AvalDao() {
    }

    public List<Avaliacao> pesquisar(int tipo, String pesq) throws SQLException {

        List<Avaliacao> lista = new ArrayList();
        Session sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.getTransaction().begin();

        Criteria consulta = sessao.createCriteria(Avaliacao.class);
        
        switch (tipo) {

            case 1:
               consulta.add(Restrictions.like("provador", pesq + "%"));
                break;
            case 2:
               consulta.add( Restrictions.eq("nAmostra", Integer.parseInt(pesq) ) );
                break;
            case 3:
                consulta.addOrder(Order.desc("nLaudo"));
                break;
        }

        lista = consulta.list();

        sessao.getTransaction().commit();
        sessao.close();
        return lista;
    }

}
