package recipe;

import lombok.RequiredArgsConstructor;

public class RecipeService {

    rivate final RecipeRepository recipeRepository;
    @RequiredArgsConstructor
    public RecipeResponse findById(Long id) {
        return recipeRepository.findById(id)
                .map(recipe -> new RecipeResponse(
                        recipe,
                        recipe.getRecipeIngredients().stream().map(RecipeIngredientResponse::new).toList()))
                .orElseThrow(() -> {
                    log.error(NOT_FOUND_RECIPE);
                    return new NoSuchElementFoundException(NOT_FOUND_RECIPE);
                });
    }
}
