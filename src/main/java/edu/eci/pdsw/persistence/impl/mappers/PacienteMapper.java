package edu.eci.pdsw.persistence.impl.mappers;



import edu.eci.pdsw.samples.entities.Consulta;
import edu.eci.pdsw.samples.entities.Paciente;
import java.util.Date;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2106913
 */
public interface PacienteMapper {
        
    public Paciente loadPacienteById(@Param("idp")int id,@Param("tipoidp")String tipoid);
    
    public List<Paciente> loadPacientes();
    
    public void insertarPaciente(@Param("pac")Paciente p);
    
    public void insertConsulta(@Param("con")Consulta con,@Param("idp")int idPaciente, @Param("tipoidp")String tipoid,@Param("costoCon")int costoconsulta);
    
    public void actualizarPaciente(@Param("pac")Paciente pac);

}
