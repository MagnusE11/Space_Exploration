package main.java.net.magnus.mod;

import main.java.net.magnus.mod.block.ModBlocks;
import main.java.net.magnus.mod.entity.ModEntities;
import main.java.net.magnus.mod.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class ModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.METEORITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.METEORITE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOON_ROCK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOON_ROCK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHORUS_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHORUS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHORUS_PLANT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHORUS_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHORUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHORUS_LEAVES, RenderLayer.getCutout());

        EntityModelLayerRegistry.registerModelLayer(EnderBruteModel.ENDER_BRUTE, EnderBruteModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.ENDER_BRUTE, EnderBruteRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(EnderWormModel.ENDER_WORM, EnderWormModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.ENDER_WORM, EnderWormRenderer::new);

        EntityRendererRegistry.register(ModEntities.CHAIR, ChairRenderer::new);
    }
}