package recipe;

import org.springframework.stereotype.Controller;

@Controller

public class RecipeController {

    private Recipe recipe;

    @RequestMapping(method = RequestMethod.GET)
    public void getRecipe() {
       //findAll method
    }
}
