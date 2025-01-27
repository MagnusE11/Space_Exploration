package main.java.net.magnus.mod.entity.client;

import com.google.common.collect.Maps;
import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.entity.custom.EnderBruteEntity;
import main.java.net.magnus.mod.entity.custom.EnderWormEntity;
import main.java.net.magnus.mod.entity.custom.EnderWormVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class EnderWormRenderer extends MobEntityRenderer<EnderWormEntity, EnderWormModel<EnderWormEntity>> {
    private static final Map<EnderWormVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(EnderWormVariant.class), enderWormVariantIdentifierEnumMap -> {
                enderWormVariantIdentifierEnumMap.put(EnderWormVariant.DEFAULT,
                        Identifier.of(Mod.MOD_ID, "textures/entity/ender_worm/ender_worm.png"));
                enderWormVariantIdentifierEnumMap.put(EnderWormVariant.PURPLE,
                        Identifier.of(Mod.MOD_ID, "textures/entity/ender_worm/ender_worm_purple.png"));
            });

    public EnderWormRenderer(EntityRendererFactory.Context context) {
        super(context, new EnderWormModel<>(context.getPart(EnderWormModel.ENDER_WORM)), 0.6f);
    }

    @Override
    public Identifier getTexture(EnderWormEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(EnderWormEntity enderWormEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        EnderWormModel<EnderWormEntity> enderWormEntityModel = this.getModel();
        super.render(enderWormEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}