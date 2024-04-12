package com.example.registry;

import com.example.HouKai;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        ModItems.registerItem(name,new BlockItem(block,new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier(HouKai.MOD_ID, name), block);
    }
    public static final Block CRYSTALL_BLOCK = registerBlock
            ("crystal_block",new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL)));
    public static final Block CRYSTALLINE_ORE_BLOCK = registerBlock
            ("crystalline_ore_block",new ExperienceDroppingBlock(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(3.0F,3.0F)));
    public static final Block RAW_CRYSTALLINE_BLOCK = registerBlock
            ("raw_crystalline_block",new Block(AbstractBlock.Settings.create().mapColor(MapColor.IRON_GRAY).requiresTool().strength(5.0F, 6.0F)));
    public static final Block DEEPSLATE_CRYSTALLINE_ORE = registerBlock
            ("deepslate_crystalline_ore",new ExperienceDroppingBlock(AbstractBlock.Settings.copy(CRYSTALLINE_ORE_BLOCK).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static void registerModBlocks() {
        HouKai.LOGGER.info("Registering Mod Blocks for " + HouKai.MOD_ID);
    }
}
