
package com.Proyecto.service.impl;
import com.Proyecto.dao.PersonalizarDao;
import com.Proyecto.domain.Personalizar;
import com.Proyecto.service.PersonalizarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonalizarServiceImpl implements PersonalizarService{
    @Autowired
    private PersonalizarDao personalizarDao;
    
   
    
    @Transactional(readOnly = true)
     @Override
    public List<Personalizar> getPersonalizars(Personalizar personalizar) {
          var lista = personalizarDao.findAll();
        return lista;}
    
    @Override
    @Transactional(readOnly = true)    
    public Personalizar getIdQueque(Personalizar personalizar) {
        return personalizarDao.findById(personalizar.getIdQueque()).orElse(null);
    }
    
    @Transactional
    @Override
    public void save(Personalizar personalizar) {
        personalizarDao.save(personalizar);
        
    }
    
    @Transactional
    @Override
    public void delete(Personalizar personalizar) {
        personalizarDao.delete(personalizar);
    }
    
    
}
