package web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
     private GuichetWEB guichet;

    public IndexController(){
        // on injecte le compte venant du serveur RMI
        ApplicationContext contextObj = new FileSystemXmlApplicationContext("C:\\Users\\ant51\\OneDrive - uqac.ca\\Cours\\Session Hiver\\8INF956 Développement avancé de logiciels\\TP\\TP2\\Question1\\SpringMVC-master\\src\\ViaWEB.xml");
        guichet = (GuichetWEB) contextObj.getBean("GuichetWEB");
    }

    // Methode pour ajouter de l'argent
    @RequestMapping(value = "/depot", method = RequestMethod.POST)
    public String depot(@ModelAttribute("SpringWeb")GuichetWEB g, ModelMap m) {
        guichet.depot(g.getMontantDepot());
        m.addAttribute("nom",guichet.getNom());
        m.addAttribute("numero",guichet.getNumero());
        m.addAttribute("telephone",guichet.getTelephone());
        m.addAttribute("service",guichet.getService());
        m.addAttribute("solde",guichet.getSolde());
        return "redirect:/";
    }

    // Methode pour retirer de l'argent
    @RequestMapping(value = "/retrait", method = RequestMethod.POST)
    public String retrait(@ModelAttribute("SpringWeb")GuichetWEB g, ModelMap m) {
        guichet.retirer(g.getMontantRetrait());
        m.addAttribute("nom",guichet.getNom());
        m.addAttribute("numero",guichet.getNumero());
        m.addAttribute("telephone",guichet.getTelephone());
        m.addAttribute("service",guichet.getService());
        m.addAttribute("solde",guichet.getSolde());
        return "redirect:/";
    }

    // On genere le model et la vue
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(ModelMap m) {
        ModelAndView view = new ModelAndView("index", "command", guichet);
        view.getModelMap().addAttribute("nom",guichet.getNom());
        view.getModelMap().addAttribute("numero",guichet.getNumero());
        view.getModelMap().addAttribute("telephone",guichet.getTelephone());
        view.getModelMap().addAttribute("service",guichet.getService());
        view.getModelMap().addAttribute("solde",guichet.getSolde());
        return view;
    }
}