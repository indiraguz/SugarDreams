
package com.Proyecto.controller;
import com.Proyecto.domain.Personalizar;
import com.Proyecto.service.PersonalizarService;
import com.Proyecto.service.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping("/pedido")
public class PersonalizarController {
    @GetMapping("/diseños")
    public String diseños(){
        
        
        return "/pedido/diseños";
        
    }
    
    @GetMapping("/personalizar")
    public String personalizar(){
        
        
        return "/pedido/personalizar";
        
    }
    
}
