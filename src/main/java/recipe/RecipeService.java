package recipe;

import lombok.RequiredArgsConstructor;

public class RecipeService {

    private final RecipeRepository recipeRepository;
    @RequiredArgsConstructor
    public RecipeResponse findById(Long id) {
        return recipeRepository.findById(id)
                .map(recipe -> new RecipeResponse(
                        recipe)
                .orElseThrow(() -> {
                    log.error(NOT_FOUND_RECIPE);
                    return new NoSuchElementFoundException(NOT_FOUND_RECIPE);
                });
    }
}
