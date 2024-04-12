package com.example.registry;


import com.example.HouKai;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup crystall_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HouKai.MOD_ID, "crystall"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crystall"))
                    .icon(() -> new ItemStack(ModItems.CRYSTAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CRYSTAL);
                        entries.add(ModItems.RAW_CRYSTALLINE);
                        entries.add(ModBlocks.CRYSTALL_BLOCK);
                        entries.add(ModBlocks.CRYSTALLINE_ORE_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_CRYSTALLINE_ORE);
                        entries.add(ModBlocks.RAW_CRYSTALLINE_BLOCK);
                    }).build());

    public static void registerModItemGroup(){
        HouKai.LOGGER.debug("Registering mod item group for"+ HouKai.MOD_ID);
    }

}
