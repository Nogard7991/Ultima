package net.nogarden.ultimamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
//import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nogarden.ultimamod.UltimaMod;

public class ModItems {
    public static final Item DAMASCUS_INGOT = registerItem("damascus_ingot", new Item(new FabricItemSettings()));

    public static final Item DAMASCUS_PICKAXE = registerItem("damascus_pickaxe",
            new PickaxeItem(ModToolMaterial.DAMASCUS, 2, 1f, new FabricItemSettings()));
    public static final Item DAMASCUS_SWORD = registerItem("damascus_sword",
            new SwordItem(ModToolMaterial.DAMASCUS, 6, 2f, new FabricItemSettings()));
    /*
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DAMASCUS_INGOT);

        entries.add(DAMASCUS_PICKAXE);
        entries.add(DAMASCUS_SWORD);
    }
    */

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(UltimaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UltimaMod.LOGGER.info("Registering Mod Items for " + UltimaMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
