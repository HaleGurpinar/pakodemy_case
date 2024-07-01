package recipe;

import java.util.HashMap;
import java.util.Map;

public class Recipe {


    private long id;
    private String title;
    private String image;
    private String steps;

    public Map<String, Object> toFullMap() {
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("title", title);
        result.put("image", image);
        result.put("steps", steps);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }
    @Override
    public boolean equals(Object o) {
        return o instanceof Recipe && this.getId() == ((Recipe) o).getId();
    }

}
