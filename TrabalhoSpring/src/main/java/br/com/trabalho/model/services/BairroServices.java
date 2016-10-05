
package br.com.trabalho.model.services;

import br.com.trabalho.model.Bairro;
import java.util.Collection;

/**
 *
 * @author Thaiz
 */
public interface BairroServices {
    
    Bairro findById(Long id);
    
    Collection<Bairro> findAll();
    
    Bairro create(Bairro bairro);
    
    Bairro update(Bairro bairro);
    
    void delete(Bairro bairro);
  
}
