package europa.content

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.type.Item;

public class EuropaItems {
    public static Item
            lime,
            rust, concrete,
            sulfur
    ;
    public static final Seq<Item> europaItems = new Seq<>();
    public static void load() {
        lime = new Item("lime", Color.valueOf("c4bbb3")){{
            hardness = 1;
            cost = 0.7f;
            alwaysUnlocked = true;
        }};
        rust = new Item("rust", Color.valueOf("662f1b")){{
            hardness = 1;
            cost = 0.8f;
        }};
        concrete = new Item("concrete", Color.valueOf("777777")){{
            hardness = 1;
            cost = 0.9f;
        }};
        sulfur = new Item("sulfur", Color.valueOf("a98c12")){{
            hardness = 2;
            cost = 1.1f;
            flammability = 1.5f;
            explosiveness = 0.5f;
        }};
        europaItems.addAll(
                lime,
                rust, concrete,
                sulfur
        );
    }
}
