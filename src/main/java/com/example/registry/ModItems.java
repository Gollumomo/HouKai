package com.example.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.example.HouKai;

public class ModItems {
    public static final Item CRYSTAL = registerItem("crystal",
            new Item(new FabricItemSettings()));
    public static final Item RAW_CRYSTALLINE = registerItem("raw_crystalline",
            new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(HouKai.MOD_ID, name), item);
        }
    public static void registerModItems() {
        HouKai.LOGGER.info("Registering Mod Items for " + HouKai.MOD_ID);
    }
}
