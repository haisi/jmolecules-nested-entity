package li.selman.jmoleculesentites.menu;

import org.jmolecules.ddd.types.Entity;
import org.jmolecules.ddd.types.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * E.g. Drinks, Dessert, Pizza
 */
public class Category implements Entity<Menu, Category.CategoryId> {

    private final CategoryId id;
    private String name;

    private final List<CategoryItem> items;

    Category(String name) {
        this.id = new CategoryId(UUID.randomUUID());
        this.name = name;
        this.items = new ArrayList<>();
    }

    @Override
    public CategoryId getId() {
        return id;
    }

    public record CategoryId(UUID id) implements Identifier {}
}
