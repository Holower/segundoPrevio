/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import model.Participante;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface ParticipanteDAO {
      List<Participante> findAll();
    
    Participante findById(Integer id);
    
    Participante save(Participante grufa);
    
    void delete(Participante poll);
    
    void deleteById(Integer id);
    
    Participante update(Participante poll);
}
