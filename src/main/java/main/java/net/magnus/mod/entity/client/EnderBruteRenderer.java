package main.java.net.magnus.mod.entity.client;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.entity.custom.EnderBruteEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class EnderBruteRenderer extends MobEntityRenderer<EnderBruteEntity, EnderBruteModel<EnderBruteEntity>> {

    public EnderBruteRenderer(EntityRendererFactory.Context context) {
        super(context, new EnderBruteModel<>(context.getPart(EnderBruteModel.ENDER_BRUTE)), 0.6f);
    }

    @Override
    public Identifier getTexture(EnderBruteEntity entity) {
        return Identifier.of(Mod.MOD_ID, "textures/entity/ender_brute/ender_brute.png");
    }

    @Override
    public void render(EnderBruteEntity enderBruteEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        EnderBruteModel<EnderBruteEntity> enderBruteEntityModel = this.getModel();
        super.render(enderBruteEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}