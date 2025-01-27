package main.java.net.magnus.mod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class EnderitePickaxeItem extends MiningToolItem {
    public EnderitePickaxeItem(ToolMaterial material, Item.Settings settings) {
        super(material, BlockTags.PICKAXE_MINEABLE, settings);
    }
}
