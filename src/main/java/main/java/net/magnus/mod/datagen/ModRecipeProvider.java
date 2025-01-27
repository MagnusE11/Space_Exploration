package main.java.net.magnus.mod.datagen;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.item.ModItems;
import main.java.net.magnus.mod.util.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> URANIUM_SMELTABLES = List.of(ModBlocks.URANIUM_ORE,
                ModBlocks.DEEPSLATE_URANIUM_ORE);
        List<ItemConvertible> ENDERITE_SMELTABLES = List.of(ModBlocks.ENDERITE_DEBRIS);

        offerSmelting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT, 1.0f, 200, "uranium");
        offerBlasting(exporter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT, 1.0f, 100, "uranium");
        offerSmelting(exporter, ENDERITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP, 1.0f, 200, "enderite");
        offerBlasting(exporter, ENDERITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP, 1.0f, 100, "enderite");




        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.URANIUM_INGOT)
                .criterion(hasItem(ModItems.URANIUM_INGOT), conditionsFromItem(ModItems.URANIUM_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "uranium_block_from_uranium_ingot"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_INGOT, 9)
                .input(ModBlocks.URANIUM_BLOCK)
                .criterion(hasItem(ModBlocks.URANIUM_BLOCK), conditionsFromItem(ModBlocks.URANIUM_BLOCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "uranium_ingot_from_uranium_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.URANIUM_NUGGET, 9)
                .input(ModItems.URANIUM_INGOT)
                .criterion(hasItem(ModItems.URANIUM_INGOT), conditionsFromItem(ModItems.URANIUM_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "uranium_nuggets_from_uranium_ingot"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.MOON_LAMP)
                .pattern(" R ")
                .pattern("RGR")
                .pattern(" R ")
                .input('R', ModBlocks.MOON_ROCK)
                .input('G', Blocks.GLOWSTONE)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_lamp_from_moon_rock"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_INGOT)
                .pattern("NNN")
                .pattern("NEE")
                .pattern("EE ")
                .input('N', ModItems.ENDERITE_SCRAP)
                .input('E', Items.NETHERITE_SCRAP)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_ingot_from_enderite_scrap_and_netherite_scrap"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_SWORD)
                .pattern(" NF")
                .pattern(" N ")
                .pattern(" E ")
                .input('N', ModItems.ENDERITE_INGOT)
                .input('E', Items.STICK)
                .input('F', Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_sword_from_enderite_and_stick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_PICKAXE)
                .pattern("NNN")
                .pattern(" EF")
                .pattern(" E ")
                .input('N', ModItems.ENDERITE_INGOT)
                .input('E', Items.STICK)
                .input('F', Items.NETHERITE_PICKAXE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_pickaxe_from_enderite_and_stick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_AXE)
                .pattern("FNN")
                .pattern(" EN")
                .pattern(" E ")
                .input('N', ModItems.ENDERITE_INGOT)
                .input('E', Items.STICK)
                .input('F', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_axe_from_enderite_and_stick_1"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_AXE)
                .pattern("NNF")
                .pattern("NE ")
                .pattern(" E ")
                .input('N', ModItems.ENDERITE_INGOT)
                .input('E', Items.STICK)
                .input('F', Items.NETHERITE_AXE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_axe_from_enderite_and_stick_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_SHOVEL)
                .pattern("FN ")
                .pattern(" E ")
                .pattern(" E ")
                .input('N', ModItems.ENDERITE_INGOT)
                .input('E', Items.STICK)
                .input('F', Items.NETHERITE_SHOVEL)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_shovel_from_enderite_and_stick"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_HOE)
                .pattern("NNF")
                .pattern(" E ")
                .pattern(" E ")
                .input('N', ModItems.ENDERITE_INGOT)
                .input('E', Items.STICK)
                .input('F', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_hoe_from_enderite_and_stick_1"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_HOE)
                .pattern("FNN")
                .pattern(" E ")
                .pattern(" E ")
                .input('N', ModItems.ENDERITE_INGOT)
                .input('E', Items.STICK)
                .input('F', Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_hoe_from_enderite_and_stick_2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDERITE_BLOCK)
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.ENDERITE_INGOT)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_block_from_enderite_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_HAMMER)
                .pattern("EPE")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('E', ModItems.ENDERITE_INGOT)
                .input('P', ModItems.ENDERITE_PICKAXE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_PICKAXE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_hammer_from_sticks_enderite_ingots_and_enderite_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_HELMET)
                .pattern("EEE")
                .pattern("ENE")
                .pattern("   ")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('N', Items.NETHERITE_HELMET)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_helmet_from_enderite_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_CHESTPLATE)
                .pattern("ENE")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('N', Items.NETHERITE_CHESTPLATE)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_chestplate_from_enderite_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_LEGGINGS)
                .pattern("EEE")
                .pattern("ENE")
                .pattern("E E")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('N', Items.NETHERITE_LEGGINGS)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_leggings_from_enderite_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_BOOTS)
                .pattern("   ")
                .pattern("E E")
                .pattern("ENE")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('N', Items.NETHERITE_BOOTS)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_boots_from_enderite_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_SCYTHE)
                .pattern("ENB")
                .pattern("ETN")
                .pattern(" S ")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('N', Items.NETHER_STAR)
                .input('B', Items.BEACON)
                .input('S', Items.STICK)
                .input('T', ModItems.ENDERITE_SWORD)
                .criterion(hasItem(Items.BEACON), conditionsFromItem(Items.BEACON))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_scythe_from_enderite_ingot_enderite_sword_nether_star_and_beacon"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_VIKING_AXE)
                .pattern("ETE")
                .pattern("ES ")
                .pattern(" S ")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('S', Items.STICK)
                .input('T', ModItems.ENDERITE_AXE)
                .criterion(hasItem(ModItems.ENDERITE_AXE), conditionsFromItem(ModItems.ENDERITE_AXE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_viking_axe_from_enderite_ingot_enderite_axe_and_stick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ENDERITE_DIGGER)
                .pattern(" E ")
                .pattern(" T ")
                .pattern(" S ")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('S', Items.STICK)
                .input('T', ModItems.ENDERITE_SHOVEL)
                .criterion(hasItem(ModItems.ENDERITE_SHOVEL), conditionsFromItem(ModItems.ENDERITE_SHOVEL))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "upgraded_enderite_hoe_from_enderite_ingot_enderite_hoe_and_stick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.UPGRADED_ENDERITE_HOE)
                .pattern("EET")
                .pattern("  S")
                .pattern("  S")
                .input('E', ModItems.ENDERITE_INGOT)
                .input('S', Items.STICK)
                .input('T', ModItems.ENDERITE_HOE)
                .criterion(hasItem(ModItems.ENDERITE_HOE), conditionsFromItem(ModItems.ENDERITE_HOE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "enderite_digger_from_enderite_ingot_enderite_shovel_and_stick"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_STAIRS, 6)
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .input('E', ModBlocks.METEORITE)
                .criterion(hasItem(ModBlocks.METEORITE), conditionsFromItem(ModBlocks.METEORITE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "meteorite_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_ROCK_STAIRS, 6)
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .input('E', ModBlocks.MOON_ROCK)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_rock_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_STAIRS, 6)
                .pattern("E  ")
                .pattern("EE ")
                .pattern("EEE")
                .input('E', ModBlocks.CHORUS_PLANKS)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chorus_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("EEE")
                .input('E', ModBlocks.METEORITE)
                .criterion(hasItem(ModBlocks.METEORITE), conditionsFromItem(ModBlocks.METEORITE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "meteorite_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_ROCK_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("EEE")
                .input('E', ModBlocks.MOON_ROCK)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_rock_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("EEE")
                .input('E', ModBlocks.CHORUS_PLANKS)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chorus_slab"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_BUTTON, 9)
                .input(ModBlocks.METEORITE)
                .criterion(hasItem(ModBlocks.METEORITE), conditionsFromItem(ModBlocks.METEORITE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "meteorite_button"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_BUTTON, 9)
                .input(ModBlocks.CHORUS_PLANKS)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chorus_button"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_ROCK_BUTTON, 9)
                .input(ModBlocks.MOON_ROCK)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_rock_button"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_PRESSURE_PLATE, 4)
                .pattern("   ")
                .pattern("   ")
                .pattern("EE ")
                .input('E', ModBlocks.METEORITE)
                .criterion(hasItem(ModBlocks.METEORITE), conditionsFromItem(ModBlocks.METEORITE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "meteorite_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_ROCK_PRESSURE_PLATE, 4)
                .pattern("   ")
                .pattern("   ")
                .pattern("EE ")
                .input('E', ModBlocks.MOON_ROCK)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_rock_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_PRESSURE_PLATE, 4)
                .pattern("   ")
                .pattern("   ")
                .pattern("EE ")
                .input('E', ModBlocks.CHORUS_PLANKS)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chorus_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_FENCE, 6)
                .pattern("EFE")
                .pattern("EFE")
                .pattern("   ")
                .input('E', ModBlocks.METEORITE)
                .input('F', Items.STICK)
                .criterion(hasItem(ModBlocks.METEORITE), conditionsFromItem(ModBlocks.METEORITE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "meteorite_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_ROCK_FENCE, 6)
                .pattern("EFE")
                .pattern("EFE")
                .pattern("   ")
                .input('E', ModBlocks.MOON_ROCK)
                .input('F', Items.STICK)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_rock_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_FENCE, 6)
                .pattern("EFE")
                .pattern("EFE")
                .pattern("   ")
                .input('E', ModBlocks.CHORUS_PLANKS)
                .input('F', Items.STICK)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chorus_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_FENCE_GATE, 2)
                .pattern("FEF")
                .pattern("FEF")
                .pattern("   ")
                .input('E', ModBlocks.METEORITE)
                .input('F', Items.STICK)
                .criterion(hasItem(ModBlocks.METEORITE), conditionsFromItem(ModBlocks.METEORITE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "meteorite_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_ROCK_FENCE_GATE, 2)
                .pattern("FEF")
                .pattern("FEF")
                .pattern("   ")
                .input('E', ModBlocks.MOON_ROCK)
                .input('F', Items.STICK)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_rock_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_FENCE_GATE, 2)
                .pattern("FEF")
                .pattern("FEF")
                .pattern("   ")
                .input('E', ModBlocks.CHORUS_PLANKS)
                .input('F', Items.STICK)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chorus_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.METEORITE_WALL, 6)
                .pattern("   ")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModBlocks.METEORITE)
                .criterion(hasItem(ModBlocks.METEORITE), conditionsFromItem(ModBlocks.METEORITE))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "meteorite_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOON_ROCK_WALL, 6)
                .pattern("   ")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModBlocks.MOON_ROCK)
                .criterion(hasItem(ModBlocks.MOON_ROCK), conditionsFromItem(ModBlocks.MOON_ROCK))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "moon_rock_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_WALL, 6)
                .pattern("   ")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', ModBlocks.CHORUS_PLANKS)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chorus_wall"));

        offerPlanksRecipe(exporter, ModBlocks.CHORUS_PLANKS, ModItemTags.CHORUS_LOGS, 4);
        offerBarkBlockRecipe(exporter, ModBlocks.CHORUS_WOOD, ModBlocks.CHORUS_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_CHORUS_WOOD, ModBlocks.STRIPPED_CHORUS_LOG);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHAIR, 6)
                .pattern("E  ")
                .pattern("EEE")
                .pattern("E E")
                .input('E', ModBlocks.CHORUS_PLANKS)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter, Identifier.of(Mod.MOD_ID, "chair"));

    }
}
