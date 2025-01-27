package main.java.net.magnus.mod.entity.client;

import main.java.net.magnus.mod.Mod;
import main.java.net.magnus.mod.entity.custom.EnderWormEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class EnderWormModel<T extends EnderWormEntity> extends SinglePartEntityModel<T>{
    public static final EntityModelLayer ENDER_WORM = new EntityModelLayer(Identifier.of(Mod.MOD_ID, "ender_worm"), "main");

    private final ModelPart ender_worm;
    private final ModelPart head;
    public EnderWormModel(ModelPart root) {
        this.ender_worm = root.getChild("ender_worm");
        this.head = this.ender_worm.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData ender_worm = modelPartData.addChild("ender_worm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData head = ender_worm.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -3.0F, -4.4F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -3.0F));

        ModelPartData body = ender_worm.addChild("body", ModelPartBuilder.create().uv(0, 5).cuboid(-3.0F, -4.0F, -2.4F, 6.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -3.0F));

        ModelPartData tail = ender_worm.addChild("tail", ModelPartBuilder.create().uv(2, 5).cuboid(-2.0F, -3.0F, 2.6F, 4.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -3.0F));

        ModelPartData tail2 = ender_worm.addChild("tail2", ModelPartBuilder.create().uv(5, 6).cuboid(-1.0F, -2.0F, 4.6F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData tail3 = ender_worm.addChild("tail3", ModelPartBuilder.create().uv(6, 7).cuboid(-1.0F, -1.0F, 11.6F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -3.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public void setAngles(EnderWormEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(EnderWormAnimations.ANIM_ENDER_WORM_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, EnderWormAnimations.ANIM_ENDER_WORM_IDLE, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        ender_worm.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return ender_worm;
    }
}
