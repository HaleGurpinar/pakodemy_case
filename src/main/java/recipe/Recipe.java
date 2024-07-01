package recipe;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

public class Recipe {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String image;
    private String steps;

    public Map<String, Object> toFullMap() {
        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("title", name);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append(", steps=").append(steps);
        sb.append('}');
        return sb.toString();
    }
}
