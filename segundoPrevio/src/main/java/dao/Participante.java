/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import
import java.util.List;
import javax.transaction.Transactional;

/**
 *
 * @author DELL
 */
public class Participante extends AbstractDAO implements ParticipanteDAO{

    public ParticipanteDAOImpl() {
        super(Participante.class);
    }

    public List<Participante> findAll() {
    return (List<Participante>)super.findAll();       
    }

    public Participante findById(Integer id) {
    return (Participante) super.findByKey(id);
    }
    
  @Transactional
    public Participante save(Participante grufa) {
    super.save(grufa);
        return (Participante) super.findByKey(grufa.getId());    
    }

    public void delete(Participante poll) {
    super.delete(poll);
    }

    public void deleteById(Integer id) {
    super.deleteByKey(id);    
    }

    public Participante update(Participante poll) {
    return (Participante) super.update(poll);   
    }

    
}
