package com.socrates.controller;

import com.socrates.controller.mapper.PersonaBusinessMapper;
import com.socrates.controller.mapper.UserBusinessMapper;
import com.socrates.controller.model.PersonaDTO;
import com.socrates.controller.model.UserDTO;
import com.socrates.service.service.PersonaService;
import com.socrates.service.service.UserService;
import com.socrates.service.vo.PersonaVO;
import com.socrates.service.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;
    @Autowired
    private PersonaBusinessMapper personaBusinessMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private UserBusinessMapper userBusinessMapper;



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView crearPersona(@ModelAttribute("persona") PersonaDTO personaDTO){
        //TODO ESTO NO MOLA MUCHO, NO ES LOGICA DE CONTROLLER
        UserVO userVO=userService.findByUsername(personaDTO.getUsername());
        PersonaVO personaVO = personaBusinessMapper.directMapping(personaDTO);
        personaVO.setUser(userVO);
        personaService.crearPersona(personaVO);
        ModelAndView modelAndView = new ModelAndView("createPersonaPage");
        return modelAndView;
    }
    @RequestMapping(value = "/createPersonaPage", method = RequestMethod.GET)
    public ModelAndView mostrarCrearPesronaPage(){
        List<UserDTO> usuarios = userBusinessMapper.inverseMapping(userService.obtenerUsuarios());
        ModelAndView modelAndView = new ModelAndView("createPersonaPage");
        modelAndView.addObject("listaUsuarios",usuarios.stream().map(UserDTO::getUsername).collect(Collectors.toList()));
        return modelAndView;
    }

    @GetMapping(value = "/findAll")
    public ModelAndView listarUsuarios() {
        ModelAndView modelAndView = new ModelAndView("listarPersonasPage");
        List<PersonaVO> personaVOS = personaService.obtenerPersonas();
        List<PersonaDTO> personas = personaBusinessMapper.inverseMapping(personaVOS);



        modelAndView.addObject("usersList", personas);
        return modelAndView;
    }
}
