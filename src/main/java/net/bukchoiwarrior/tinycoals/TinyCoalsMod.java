package net.bukchoiwarrior.tinycoals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TinyCoalsMod implements ModInitializer {
    public static final Item TINY_CHARCOAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TINY_COAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    @Override
    public void onInitialize() {
        System.out.println("TINY COALS MOD");
        Registry.register(Registry.ITEM, new Identifier("tinycoals", "tiny_charcoal"), TINY_CHARCOAL);
        FuelRegistry.INSTANCE.add(TINY_CHARCOAL, 200);
        Registry.register(Registry.ITEM, new Identifier("tinycoals", "tiny_coal"), TINY_COAL);
        FuelRegistry.INSTANCE.add(TINY_COAL, 200);
    }

}

//public class TinyCharcoal extends Item {
//
//    public TinyCharcoal(Settings settings) {
//
//        super(settings);
//
//    }
//
//    @Override
//
//}