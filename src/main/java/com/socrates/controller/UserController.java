package com.socrates.controller;

import com.socrates.controller.mapper.UserBusinessMapper;
import com.socrates.controller.model.PersonaDTO;
import com.socrates.controller.model.UserDTO;
import com.socrates.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User controller.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserBusinessMapper userBusinessMapper;

    /**
     * Determinar user page string.
     *
     * @param authentication the authentication
     * @return the string
     */
    @GetMapping(value = "/userPage")
    public String determinarUserPage(Authentication authentication) {
        String pagina = "index";
        //verificación de que la sesion es valida
        if (null != authentication && authentication.getAuthorities().size() > 0) {
            List<GrantedAuthority> roles = (List<GrantedAuthority>) authentication.getAuthorities();
            GrantedAuthority role = roles.get(0);
            switch (role.getAuthority()) {
                case "ROLE_ADMIN":
                    pagina = "adminPage";
                    break;
                case "ROLE_PROFESOR":
                    pagina = "profesorPage";
                    break;
                case "ROLE_ALUMNO":
                    pagina = "alumnoPage";
                    break;
                default:
                    break;

            }
        }
        return pagina;
    }

    @PostMapping(value = "/create")
    public ModelAndView createUser(@ModelAttribute("user") PersonaDTO userDTO) {
        //TODO Esto realmente debería ir por configuracion pero bueno. poco a poco
        List<String> roles = userDTO.getUserDTO().getRoles();
        for (int i = 0; i < roles.size(); i++) {
            String rol = roles.get(i);
            roles.set(i, "ROLE_" + rol.toUpperCase());
        }
        userService.createUser(userBusinessMapper.directMapping(userDTO.getUserDTO()));
        ModelAndView modelAndView = new ModelAndView("createUserPage");
        modelAndView.addObject("user", userDTO);
        return modelAndView;
    }

    @GetMapping(value = "/findAll")
    public ModelAndView listarUsuarios() {
        ModelAndView modelAndView = new ModelAndView("listarUsuariosPage");
        List<PersonaDTO> personas = new ArrayList<>();
        PersonaDTO persona1 = new PersonaDTO();
        persona1.setApellido1("Anton");
        persona1.setApellido2("Bueso");
        persona1.setNombre("Pepe Lui");
        UserDTO user = new UserDTO();
        user.setUsername("monguer");
        persona1.setUserDTO(user);

        PersonaDTO persona2 = new PersonaDTO();
        persona2.setApellido1("Buga");
        persona2.setApellido2("Huga");
        persona2.setNombre("Lobo");
        UserDTO user2 = new UserDTO();
        user2.setUsername("admin");
        persona2.setUserDTO(user2);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);
        personas.add(persona2);



        modelAndView.addObject("usersList", personas);
        return modelAndView;
    }

}
