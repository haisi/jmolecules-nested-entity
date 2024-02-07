package li.selman.jmoleculesentites.menu;

import org.jmolecules.ddd.types.Entity;
import org.jmolecules.ddd.types.Identifier;

import java.util.UUID;

/**
 * menu-category <-> product
 */
public class CategoryItem implements Entity<Menu, CategoryItem.CategoryItemId> {

    private final CategoryItemId id;

    public CategoryItem() {
        // image we pass here the CategoryId and the ProductId instead...
        this.id = new CategoryItemId(UUID.randomUUID());
    }

    @Override
    public CategoryItemId getId() {
        return id;
    }

    public record CategoryItemId(UUID id) implements Identifier {
    }

}
