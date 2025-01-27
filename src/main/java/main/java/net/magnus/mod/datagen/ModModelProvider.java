package main.java.net.magnus.mod.datagen;

import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.block.custom.ChorusBerryBushBlock;
import main.java.net.magnus.mod.block.custom.ChorusPlantCropBlock;
import main.java.net.magnus.mod.item.ModItems;
import main.java.net.magnus.mod.block.custom.MoonLampBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_END_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_URANIUM_ORE);
        blockStateModelGenerator.registerSingleton(ModBlocks.ENDERITE_DEBRIS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool meteoritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METEORITE);
        BlockStateModelGenerator.BlockTexturePool moonRockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOON_ROCK);
        BlockStateModelGenerator.BlockTexturePool chorusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHORUS_PLANKS);
        blockStateModelGenerator.registerLog(ModBlocks.CHORUS_LOG).log(ModBlocks.CHORUS_LOG).wood(ModBlocks.CHORUS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHORUS_LOG).log(ModBlocks.STRIPPED_CHORUS_LOG).wood(ModBlocks.STRIPPED_CHORUS_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHORUS_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CHORUS_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        meteoritePool.stairs(ModBlocks.METEORITE_STAIRS);
        meteoritePool.slab(ModBlocks.METEORITE_SLAB);
        meteoritePool.button(ModBlocks.METEORITE_BUTTON);
        meteoritePool.pressurePlate(ModBlocks.METEORITE_PRESSURE_PLATE);
        meteoritePool.fence(ModBlocks.METEORITE_FENCE);
        meteoritePool.fenceGate(ModBlocks.METEORITE_FENCE_GATE);
        meteoritePool.wall(ModBlocks.METEORITE_WALL);

        moonRockPool.stairs(ModBlocks.MOON_ROCK_STAIRS);
        moonRockPool.slab(ModBlocks.MOON_ROCK_SLAB);
        moonRockPool.button(ModBlocks.MOON_ROCK_BUTTON);
        moonRockPool.pressurePlate(ModBlocks.MOON_ROCK_PRESSURE_PLATE);
        moonRockPool.fence(ModBlocks.MOON_ROCK_FENCE);
        moonRockPool.fenceGate(ModBlocks.MOON_ROCK_FENCE_GATE);
        moonRockPool.wall(ModBlocks.MOON_ROCK_WALL);

        chorusPool.stairs(ModBlocks.CHORUS_STAIRS);
        chorusPool.slab(ModBlocks.CHORUS_SLAB);
        chorusPool.button(ModBlocks.CHORUS_BUTTON);
        chorusPool.pressurePlate(ModBlocks.CHORUS_PRESSURE_PLATE);
        chorusPool.fence(ModBlocks.CHORUS_FENCE);
        chorusPool.fenceGate(ModBlocks.CHORUS_FENCE_GATE);
        chorusPool.wall(ModBlocks.CHORUS_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.METEORITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.METEORITE_TRAPDOOR);


        blockStateModelGenerator.registerDoor(ModBlocks.MOON_ROCK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MOON_ROCK_TRAPDOOR);


        blockStateModelGenerator.registerDoor(ModBlocks.CHORUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHORUS_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.MOON_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.MOON_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.MOON_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(MoonLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));


        blockStateModelGenerator.registerCrop(ModBlocks.CHORUS_PLANT_CROP, ChorusPlantCropBlock.AGE, 0, 1, 2 ,3 ,4 ,5, 6);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CHORUS_BERRY_BUSH,
                BlockStateModelGenerator.TintType.NOT_TINTED, ChorusBerryBushBlock.AGE, 0, 1, 2, 3);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHAIR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.URANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.PORTAL_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PORTAL_LIGHTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROMOS_MAGIC_TOUCH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAD_PAST_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAND_OF_PETALS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGHTHAWK_ISOLATION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHIAWASE_VIP_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModBlocks.CHORUS_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ENDERITE_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_VIKING_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_DIGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.UPGRADED_ENDERITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_BOOTS));

        itemModelGenerator.register(ModItems.ENDERITE_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDER_BRUTE_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.ENDER_WORM_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
    }
}
