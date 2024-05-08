package net.nogarden.ultimamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.nogarden.ultimamod.block.ModBlocks;
import net.nogarden.ultimamod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAMASCUS_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DAMASCUS_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.DAMASCUS_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DAMASCUS_SWORD, Models.HANDHELD);
    }
}
