package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.CasoDTO;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> getAll(); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    CasoDTO save(CasoDTO caso);

    CasoDTO getById(Long id);
}
