package net.nogarden.ultimamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nogarden.ultimamod.UltimaMod;
import net.nogarden.ultimamod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup ULTIMA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(UltimaMod.MOD_ID, "damascus_ingot"),
            FabricItemGroup.builder().displayName(Text.of("Ultima Mod"))
                    .icon(() -> new ItemStack(ModItems.DAMASCUS_INGOT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DAMASCUS_INGOT);
                        entries.add(ModBlocks.DAMASCUS_BLOCK);

                        entries.add(ModItems.DAMASCUS_SWORD);
                        entries.add(ModItems.DAMASCUS_PICKAXE);

                    }).build());

    public static void registerItemGroups() {
        UltimaMod.LOGGER.info("Registering Item Groups for " + UltimaMod.MOD_ID);
    }
}
