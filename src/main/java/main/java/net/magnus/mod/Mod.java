package main.java.net.magnus.mod;

import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.component.ModDataComponentTypes;
import main.java.net.magnus.mod.effect.ModEffects;
import main.java.net.magnus.mod.enchantment.ModEnchantmentEffects;
import main.java.net.magnus.mod.entity.ModEntities;
import main.java.net.magnus.mod.entity.custom.EnderBruteEntity;
import main.java.net.magnus.mod.entity.custom.EnderWormEntity;
import main.java.net.magnus.mod.item.ModItems;
import main.java.net.magnus.mod.item.ModItemsGroup;
import main.java.net.magnus.mod.potion.ModPotions;
import main.java.net.magnus.mod.sound.ModSounds;
import main.java.net.magnus.mod.util.HammerUsageEvent;
import main.java.net.magnus.mod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.*;
import net.minecraft.block.FireBlock;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {
	public static final String MOD_ID = "mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(ModItems.URANIUM_INGOT, 25000);
		FuelRegistry.INSTANCE.add(ModBlocks.URANIUM_BLOCK, 32767);
		FuelRegistry.INSTANCE.add(ModItems.URANIUM_NUGGET, 2778);
		ModDataComponentTypes.registerDataComponentTypes();
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
		ModSounds.registerSounds();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModEnchantmentEffects.registerEnchantmentEffects();
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.URANIUM_INGOT, ModPotions.RADIOACTIVE_POTION);
		});
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHORUS_SNACK, 1.0f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHORUS_SEED, 0.75f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHORUS_BERRIES, 1.0f);
		ModWorldGeneration.generateModWorldGen();
		StrippableBlockRegistry.register(ModBlocks.CHORUS_LOG, ModBlocks.STRIPPED_CHORUS_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHORUS_WOOD, ModBlocks.STRIPPED_CHORUS_WOOD);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHORUS_LOG, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHORUS_WOOD, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHORUS_LOG, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHORUS_WOOD, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHORUS_PLANKS, 4, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHORUS_LEAVES, 30, 60);
		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.ENDER_BRUTE, EnderBruteEntity.createEnderBruteAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ENDER_WORM, EnderWormEntity.createEnderWormAttributes());
		LOGGER.info("If You See This Than The Game Will Launch Successfully");
	}
}