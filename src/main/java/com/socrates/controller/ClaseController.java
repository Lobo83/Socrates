package com.socrates.controller;

import com.socrates.controller.mapper.ClaseBusinessMapper;
import com.socrates.controller.mapper.MateriaBusinessMapper;
import com.socrates.controller.mapper.PersonaBusinessMapper;
import com.socrates.controller.mapper.PersonaProfesorBusinessMapper;
import com.socrates.controller.model.ClaseDTO;
import com.socrates.controller.model.MateriaDTO;
import com.socrates.controller.model.PersonaDTO;
import com.socrates.service.service.ClaseService;
import com.socrates.service.service.MateriaService;
import com.socrates.service.service.ProfesorService;
import com.socrates.service.vo.MateriaVO;
import com.socrates.service.vo.PersonaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/clase")
public class ClaseController {
    @Autowired
    private ClaseBusinessMapper claseBusinessMapper;
    @Autowired
    private ClaseService claseService;

    @Autowired
    private ProfesorService profesorService;
    @Autowired
    private PersonaBusinessMapper personaBusinessMapper;

    @Autowired
    private PersonaProfesorBusinessMapper personaProfesorBusinessMapper;

    @Autowired
    private MateriaService materiaService;
    @Autowired
    private MateriaBusinessMapper materiaBusinessMapper;

    /**
     * Crear aula model and view.
     *
     * @param claseDTO the aula dto
     * @return the model and view
     */
    @PostMapping("/crear")
    public ModelAndView crearClase(@ModelAttribute("clase") @Valid ClaseDTO claseDTO, BindingResult result, Model model) {
        ModelAndView modelAndView = new ModelAndView("createClasePage");
        PersonaDTO persona =
            personaBusinessMapper.inverseMapping(profesorService.obtenerProfesor(claseDTO.getIdProfesor()));
        MateriaDTO materia = materiaBusinessMapper.inverseMapping(materiaService.obtenerMateria(claseDTO.getIdMateria()));
        claseDTO.setProfesor(personaProfesorBusinessMapper.directMapping(persona));
        claseDTO.setMateria(materia);
        claseDTO =
            claseBusinessMapper.inverseMapping(claseService.crearClase(claseBusinessMapper.directMapping(claseDTO)));
        modelAndView.addObject("clase", claseDTO);
        modelAndView.addObject("profesores", obtenerProfesores());
        modelAndView.addObject("materias", obtenerMaterias());

        return modelAndView;
    }

    /**
     * Cargar formulario model and view.
     *
     * @return the model and view
     */
    @GetMapping("/cargar_formulario_vacio")
    public ModelAndView cargarFormulario() {
        ModelAndView modelAndView = new ModelAndView("createClasePage");
        //TODO Inicializar las sesiones disponibles y los materiales. Se necesitan consultas
        modelAndView.addObject("profesores", obtenerProfesores());
        modelAndView.addObject("materias", obtenerMaterias());
        return modelAndView;
    }

    /**
     * Mostrar aulas model and view.
     *
     * @return the model and view
     */
    @GetMapping("/findAll")
    public ModelAndView mostrarClases() {
        ModelAndView modelAndView = new ModelAndView("listarClasesPage");
        modelAndView.addObject("clases", claseBusinessMapper.inverseMapping(claseService.obtenerClases()));
        return modelAndView;
    }

    @GetMapping("/editar")
    public ModelAndView editarClase(@RequestParam("id") Long id) {
        ClaseDTO claseDTO = claseBusinessMapper.inverseMapping(claseService.obtenerClase(id));
        ModelAndView modelAndView = new ModelAndView("createClasePage");
        modelAndView.addObject("clase", claseDTO);
        modelAndView.addObject("profesores", obtenerProfesores());
        modelAndView.addObject("materias", obtenerMaterias());
        return modelAndView;
    }

    @GetMapping("/borrar")
    public ModelAndView borrarClase(@RequestParam("id") Long id) {
        claseService.borrarClase(id);
        return mostrarClases();
    }

    private List<PersonaDTO> obtenerProfesores() {
        List<PersonaVO> profesores = profesorService.obtenerProfesores();
        return personaBusinessMapper.inverseMapping(profesores);
    }
    private List<MateriaDTO> obtenerMaterias() {
        List<MateriaVO> materias = materiaService.obtenerMaterias();
        return materiaBusinessMapper.inverseMapping(materias);
    }
}
