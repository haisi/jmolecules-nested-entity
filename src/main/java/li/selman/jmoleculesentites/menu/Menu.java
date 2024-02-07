package li.selman.jmoleculesentites.menu;

import org.jmolecules.ddd.types.AggregateRoot;
import org.jmolecules.ddd.types.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Menu implements AggregateRoot<Menu, Menu.MenuId> {

    private final MenuId id;
    private String title;
    private List<Category> categories;

    public Menu(String title) {
        this.id = new MenuId(UUID.randomUUID());
        this.title = title;
        this.categories = new ArrayList<>();
    }

    @Override
    public MenuId getId() {
        return id;
    }

    public record MenuId(UUID id) implements Identifier {
    }

}
